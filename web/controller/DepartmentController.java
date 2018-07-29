package com.hwua.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.entity.Department;
import com.hwua.entity.Employee;
import com.hwua.entity.Rights;
import com.hwua.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Resource(name="departmentService")
	private DepartmentService ds;
	
	//查询部门
	@RequestMapping("getDepartment")
	@ResponseBody
	public List<Department> getDepartment(){
		
		List<Department> list = ds.queryDepartment();
		return list;
	}
}
