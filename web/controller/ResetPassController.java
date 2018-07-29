package com.hwua.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.entity.Employee;
import com.hwua.entity.Resetpass;
import com.hwua.service.ResetpassService;

@Controller
public class ResetPassController {
	
	@Resource(name="resetpassService")
	private ResetpassService rs;
	
	
	//忘记密码
	@RequestMapping("reqResetPass")
	@ResponseBody
	public int reqResetPass(Resetpass resetpass) {
		
		Employee employee = rs.queryByUsername(resetpass.getUsername());
		boolean flag = (resetpass.getPhoneNo()).equals(employee.getPhoneNo());
		
		if (!flag) {
			return 0 ;
		}
		int result = 0;
		result = rs.add(resetpass);
		return result;
	}
	//得到所有需要重置密码的信息
		@RequestMapping("querRestRequest")
		@ResponseBody//ajax传输
		public List<Resetpass> getJobByDid(){
			List<Resetpass> list = rs.queryAllReserpass();			
			return list;
		}
		
		//重置密码
		@RequestMapping("resetPass")
		@ResponseBody
		public int resetPass(Resetpass resetPass) {
			System.err.println(resetPass);
			int result = 0;
			result = rs.resetPass(resetPass);
			return result;
			
		}
	
}
