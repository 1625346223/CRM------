package com.hwua.dao;

import java.sql.SQLException;
import java.util.List;

import com.hwua.entity.Employee;
import com.hwua.entity.Resetpass;

public interface ResetpassMapper {
    
	
   
	
	//添加重置信息
	int add(Resetpass resetpass) throws SQLException;
	//删除重置密码请求
	int remove(Resetpass resetPass)throws SQLException;
	
	//获取重置密码信息
	List<Resetpass> queryAllReserpass()throws SQLException;
	

	


	
}