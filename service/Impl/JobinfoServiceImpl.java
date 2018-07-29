package com.hwua.service.Impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwua.dao.JobinfoMapper;
import com.hwua.entity.Jobinfo;
import com.hwua.service.JobinfoService;
@Service("jobinfoService")
@Transactional
public class JobinfoServiceImpl implements JobinfoService  {
	@Resource
	private JobinfoMapper jobinfoMapper;
	@Override
	public List<Jobinfo> queryDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		List<Jobinfo>list=null;
		try {
			list=jobinfoMapper.selectByExample( departmentId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
    
}
