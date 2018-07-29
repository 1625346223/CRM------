package com.hwua.dao;

import java.sql.SQLException;
import java.util.List;

import com.hwua.entity.Custom;
import com.hwua.entity.Custominfo;
import com.hwua.entity.Custominfo_02;

public interface CustomMapper_02 {
    //本月遗留
	List<Custominfo_02> queryMonth(Custominfo custominfo)throws SQLException;
    //今天销售
	List<Custominfo_02> queryTodayByDate(Custominfo custominfo)throws SQLException;
    //本日销售
	List<Custominfo_02> queryToday(Custominfo custominfo)throws SQLException;
    //历史遗漏
	List<Custominfo_02> queryNotToday(Custominfo custominfo)throws SQLException;

	

	
}