package com.hwua.service;

import java.util.List;

import com.hwua.entity.Employee;
import com.hwua.entity.Employee02;
public interface EmployeeService {
	//登录
	Employee login(Employee employee);
	
	//添加员工
	int addEmployee(Employee employee);
	
	//添加管理员
	int addAdmin(Employee employee);
	
	//查重
	Boolean check(Employee employee);
    
	//注销员工
	int logoutUser(String username);
    //修改信息
	int updateUser(Employee employee);
    //
	Employee queryById(long parseLong);
    //修改密码
	int changePass(Employee employee);
    //查询所有员工的信息 
	List<Employee02> queryEmployees();
}
