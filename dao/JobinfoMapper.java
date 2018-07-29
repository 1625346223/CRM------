package com.hwua.dao;

import com.hwua.entity.Jobinfo;
import com.hwua.entity.JobinfoExample;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobinfoMapper {
	
	//departmentId得到职务
	List<Jobinfo> selectByExample(Long departmentId)throws SQLException;
   /* int countByExample(JobinfoExample example);

    int deleteByExample(JobinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Jobinfo record);

    int insertSelective(Jobinfo record);

    List<Jobinfo> selectByExample(JobinfoExample example);

    Jobinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Jobinfo record, @Param("example") JobinfoExample example);

    int updateByExample(@Param("record") Jobinfo record, @Param("example") JobinfoExample example);

    int updateByPrimaryKeySelective(Jobinfo record);

    int updateByPrimaryKey(Jobinfo record);*/

	
}