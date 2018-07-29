package com.hwua.service;

import java.sql.SQLException;
import java.util.List;

import com.hwua.entity.Employee;
import com.hwua.entity.Resetpass;


/**
 * Resetpass service层
 * @author Air
 *
 */
public interface ResetpassService {
    //忘记密码
	Employee queryByUsername(String userName);
    //添加重置信息
	int add(Resetpass resetpass);
	
	//得到所有需要重置密码的信息
	List<Resetpass> queryAllReserpass();
	
	//重置密码
	int resetPass(Resetpass resetpass);

}
