package com.hwua.service.Impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwua.dao.EmployeeMapper;
import com.hwua.dao.RightsMapper;
import com.hwua.entity.Employee;
import com.hwua.entity.Rights;
import com.hwua.service.RightService;

@Service("rightsService")
@Transactional
public class RightServiceImpl implements RightService  {
	@Resource
	private RightsMapper rightsMapper;
	@Override
	public List<Rights> selectByExample(Employee employee) {
		// TODO Auto-generated method stub
		List<Rights>list=null;
		
		try {
			list=rightsMapper.selectByExample(employee);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
   
}
