package com.hwua.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.Uilt.EncryptUtil;
import com.hwua.entity.Employee;
import com.hwua.entity.Employee02;
import com.hwua.entity.Rights;
import com.hwua.service.EmployeeService;
import com.hwua.service.RightService;

import net.sf.jsqlparser.statement.update.Update;
import oracle.net.aso.r;
@Controller
public class EmployeeController{
	@Resource(name="employeeService")
	private EmployeeService es;
	@Resource(name="rightsService")
	private RightService r;
	
	//登录和权限查询
	@RequestMapping("login")
	@ResponseBody
	public String login(HttpSession session,Employee employee){
		//System.err.println(employee);
		//加密
		employee.setPass(EncryptUtil.SHA256(employee.getPass()));
		//用户
		Employee user = es.login(employee);	
		//权限
		List<Rights> rights=r.selectByExample(user);
		
		//存入session
		session.setAttribute("rights", rights);
		session.setAttribute("user", user);
		String login = user!=null?"1":"0";
		return login;
	}
	//注销
	@RequestMapping("logout")
	public String logout(HttpSession session){
		session.removeAttribute("user");//清空session信息  
		/*session.invalidate();*/
		return "redirect:login.jsp";
	}
	//添加员工
	@RequestMapping("addUser")
	@ResponseBody
	public String addUser(Employee employee){		
		employee.setPass("c61bfc278c72560e5cc3a7d44154b6e3d2dfabebae62c97bd16b8d651c23eeac");
		employee.setNickname(employee.getRealName());
		int rows=0;
		rows=es.addEmployee(employee);
		return rows==1?"1":"0";
		/*return rows==1&&rows!=0;*/
	}
	//修改员工信息
	@RequestMapping("updateUser")
	@ResponseBody
	public int updateUser(HttpSession session,Employee employee){
		/*Employee user = (Employee) session.getAttribute("user");
		return es.updateUser(employee);*/
		int row=0;
		row=es.updateUser(employee);
		return row;
	}
	
	//查询是否重复
	@RequestMapping("checkUsername")
	@ResponseBody
	public Boolean check(Employee employee){
		return es.check(employee);
	}
	
	//添加管理员
		@RequestMapping("addAdmin")
		@ResponseBody
		public String addAdmin(Employee employee){
			employee.setDepartmentId(1L);
			employee.setJobInfoId(2L);
			employee.setPass("c61bfc278c72560e5cc3a7d44154b6e3d2dfabebae62c97bd16b8d651c23eeac");
			int rows = es.addAdmin(employee);	
			System.err.println(employee);
			return rows==1?"1":"0";
		}
	//注销用户
		@RequestMapping("cancleUser")
		@ResponseBody
		public int cancleUser(String username){
			
			return es.logoutUser(username);
		}
	//修改密码
		@RequestMapping("changePass")
		@ResponseBody
		public int changePass(String pass,String employeeId,String newPass){
			String oldPass=EncryptUtil.SHA256(pass);
			Employee employee =es.queryById(Long.parseLong(employeeId));
			if (!oldPass.equals(employee.getPass())) {
				return 0;
			}
			int row = 0;
			employee.setPass(EncryptUtil.SHA256(newPass));
			row = es.changePass(employee);
			return row;
		}	
	//查询所有员工信息
	@RequestMapping("allEmployees")
	@ResponseBody
	public List<Employee02> allEmployees(HttpSession session) {
		List<Employee02> list = es.queryEmployees();
		
			return list;
			}		
			
    
    
}

