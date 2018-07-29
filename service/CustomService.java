package com.hwua.service;

import java.util.List;

import com.hwua.entity.Custom;
import com.hwua.entity.Custominfo_02;


public interface CustomService {

	//客户是否重复
	
	Custom checkCustom(Custom custom);	
	
	//查询所有用户
	
	List<Custom> queryAllCustom();

	//添加客户信息
	
	int insertCustom(Custom custom);
	
    //更新顾客信息
	int updateCustom(Custom custom);
	
    //查询顾客种类
	
	List<Custominfo_02> customInfo(String src, Long followmanid);
	
}
