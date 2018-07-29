package com.hwua.service.Impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwua.dao.DepartmentMapper;
import com.hwua.entity.Department;
import com.hwua.service.DepartmentService;
@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	@Resource
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> queryDepartment() {
		// TODO Auto-generated method stub
		List<Department>list=null;
		try {
			list=departmentMapper.selectByExample();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
