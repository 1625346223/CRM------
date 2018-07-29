package com.hwua.dao;

import com.hwua.entity.Employee;
import com.hwua.entity.Rights;
import com.hwua.entity.RightsExample;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightsMapper {
 /*   int countByExample(RightsExample example);

    int deleteByExample(RightsExample example);

    int deleteByPrimaryKey(Long rid);

    int insert(Rights record);

    int insertSelective(Rights record);*/
    //权限查询
    List<Rights> selectByExample(Employee employee)throws SQLException;
    
   /* Rights selectByPrimaryKey(Long rid);*/
/*
    int updateByExampleSelective(@Param("record") Rights record, @Param("example") RightsExample example);

    int updateByExample(@Param("record") Rights record, @Param("example") RightsExample example);

    int updateByPrimaryKeySelective(Rights record);

    int updateByPrimaryKey(Rights record);*/
}