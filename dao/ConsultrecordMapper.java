package com.hwua.dao;

import com.hwua.entity.Consultrecord;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsultrecordMapper {
	/**
	 * 查custom是否被分配
	 * @return Consultrecord
	 * @throws SQLException
	 */
	Consultrecord queryById(Long customid)throws SQLException;
	/**
	 * 添加一条分配信息
	 * @return 
	 * @throws SQLException
	 */
	int allotToConsult(Consultrecord consultrecord)throws SQLException;
   
}