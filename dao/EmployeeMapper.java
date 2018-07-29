package com.hwua.dao;

import com.hwua.entity.Employee;
import com.hwua.entity.Employee02;
import com.hwua.entity.EmployeeExample;
import com.hwua.entity.Resetpass;

import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
  /*  int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);*/
  //登录的方法
    Employee login(Employee employee) throws SQLException;

  //添加员工/管理员
    int insert(Employee employee) throws SQLException;
    
  //修改信息
    int updateEmployee(Employee employee)throws SQLException;
    
  //查询是否重复
   Employee checkUserName(Employee employee)throws SQLException;
    
  //注销用户
   int  logoutUser(String username)throws SQLException;
   /*int updateByPrimaryKey(Employee employee)throws SQLException;*/
   /* int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);*/
   
   Employee queryById(long id)throws SQLException;
   //修改密码
   int changePass(Employee employee)throws SQLException;
   //忘记密码时候判断密码是否存在
   Employee queryByUsername(String username)throws SQLException;


   //重置密码
   int resetPass(Resetpass resetPass)throws SQLException;

List<Employee> querySales()throws SQLException;








  
 
}