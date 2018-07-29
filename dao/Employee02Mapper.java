package com.hwua.dao;

import com.hwua.entity.Employee02;


import java.sql.SQLException;
import java.util.List;

public interface Employee02Mapper {
   //查看员工信息
	List<Employee02> queryEmployees()throws SQLException; 
}