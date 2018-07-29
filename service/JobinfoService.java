package com.hwua.service;

import java.util.List;

import com.hwua.entity.Jobinfo;

public interface JobinfoService {
	//查询所有的职务
	List<Jobinfo>queryDepartment(Long departmentId);

	
}
