package com.hwua.dao;

import com.hwua.entity.Department;
import com.hwua.entity.DepartmentExample;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
	
	
	//查询部门
	 List<Department> selectByExample()throws SQLException;
    /*int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);*/
}