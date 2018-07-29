package com.hwua.service.Impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwua.dao.EmployeeMapper;
import com.hwua.dao.ResetpassMapper;
import com.hwua.entity.Employee;
import com.hwua.entity.Resetpass;
import com.hwua.service.ResetpassService;

@Service("resetpassService")
@Transactional
public class ResetpassServiceImpl implements ResetpassService {
	
	@Resource
	private ResetpassMapper resetpassMapper;
	@Resource
	private EmployeeMapper employeeMapper;

	

	
	//忘记时判断用户是否存在
	@Override
	public Employee queryByUsername(String username) {
		// TODO Auto-generated method stub
		Employee queryByUsername = null;
		try {
			queryByUsername = employeeMapper.queryByUsername(username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return queryByUsername;
		
	}
    //添加重置信息
	@Override
	public int add(Resetpass resetpass) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			result = resetpassMapper.add(resetpass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	//获取重置
	@Override
	public List<Resetpass> queryAllReserpass() {
		List<Resetpass> reserpassList = null;
		try {
			reserpassList = resetpassMapper.queryAllReserpass();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reserpassList;
	}
   //重置密码
	@Override
	public int resetPass(Resetpass resetPass) {
		int result = 0;
		try {
			int resetPass2 = employeeMapper.resetPass(resetPass);
			int remove = resetpassMapper.remove(resetPass);
			if (resetPass2!=0&&remove!=0) {
				result = 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
