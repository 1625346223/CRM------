package com.hwua.dao;

import java.sql.SQLException;
import java.util.List;

import com.hwua.entity.Custom;

public interface CustomMapper {

	
	//添加用户
	int saveCustom(Custom custom)throws SQLException;
	
   
    //查询所有客户
	List<Custom> queryAllCustom()throws SQLException;

	
    //客户存在
	Custom checkCustom(Custom custom)throws SQLException;
	

    //顾客更新信息	
	int updateCustom(Custom custom)throws SQLException;

    //更新 customstatu 为3 
	void setStatu(Long customid)throws SQLException;

	//查询需要分配 custom
	List<Custom> queryCustomByStatu()throws SQLException;

	//改变 custom 未销售跟进中
	int changeStuta(Long id)throws SQLException;
	
}