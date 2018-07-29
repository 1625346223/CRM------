package com.hwua.dao;

import com.hwua.entity.Consultrecord;
import com.hwua.entity.Custominfo;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustominfoMapper {
	/**
	 * 添加Custominfo
	 * @return
	 * @throws SQLException
	 */
	int add(Custominfo custominfo)throws SQLException;

   
}