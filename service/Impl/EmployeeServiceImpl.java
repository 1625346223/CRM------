package com.hwua.service.Impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwua.dao.Employee02Mapper;
import com.hwua.dao.EmployeeMapper;
import com.hwua.entity.Employee;
import com.hwua.entity.Employee02;
import com.hwua.service.EmployeeService;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Resource
	private EmployeeMapper employeeMapper;
	@Resource
	private Employee02Mapper employee02Mapper;
	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		Employee login =null;
		try {
			login=employeeMapper.login(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return login;
	}
	
	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			row=employeeMapper.insert(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public Boolean check(Employee employee) {
		// TODO Auto-generated method stub
		boolean check=false;
		try {
			Employee checkUserName=employeeMapper.checkUserName(employee);
			if (checkUserName==null) {
				check=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return check;
	}
    //添加管理员
	@Override
	public int addAdmin(Employee employee) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			row=employeeMapper.insert(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
		
	}
    //注销员工
	@Override
	public int logoutUser(String username) {
		// TODO Auto-generated method stub
		
		int row=0;
		try {
			row=employeeMapper.logoutUser(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
    //修改信息
	@Override
	public int updateUser(Employee employee) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			row=employeeMapper.updateEmployee(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	@Override
	public Employee queryById(long id) {
		// TODO Auto-generated method stub
		Employee row=null;
		try {
			row=employeeMapper.queryById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
  //修改密码
	@Override
	public int changePass(Employee employee) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			row=employeeMapper.changePass(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

	@Override
	public List<Employee02> queryEmployees() {
		// TODO Auto-generated method stub
		List<Employee02>list  = null;
		try {
			list = employee02Mapper.queryEmployees();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
   
}
