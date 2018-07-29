package com.hwua.service.Impl;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hwua.dao.CustomMapper;
import com.hwua.dao.CustomMapper_02;
import com.hwua.entity.Custom;
import com.hwua.entity.Custominfo;
import com.hwua.entity.Custominfo_02;
import com.hwua.entity.PaginationContext;
import com.hwua.service.CustomService;

@Service("customService")
@Transactional
public class CustomServiceImpl implements CustomService {
	
	@Resource
	private CustomMapper customMapper;
	@Resource
	private CustomMapper_02 customMapper_02;
	
	//添加客户
	@Override
	public int insertCustom(Custom custom) {
		int rows = 0;
		try {
			rows = customMapper.saveCustom(custom);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}
	
	//销售助理查看所有客户
	@Override
	public List<Custom> queryAllCustom(){
		List<Custom> list = null;
		try {
			PageHelper.startPage(PaginationContext.getPageNum(), PaginationContext.getPageSize());
			list = customMapper.queryAllCustom();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
    //查看客户是否存在
	@Override
	public Custom checkCustom(Custom custom) {
		// TODO Auto-generated method stub
       Custom cm=null;
       try {
		cm=customMapper.checkCustom(custom);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       return cm;
		
	
	}
   //更新顾客信息
	@Override
	public int updateCustom(Custom custom) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			row= customMapper.updateCustom(custom);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
		
		
	}
	//销售种类查询 
	@Override
	public List<Custominfo_02> customInfo(String src, Long followmanid) {
		// TODO Auto-generated method stub
		PageHelper.startPage(PaginationContext.getPageNum(), PaginationContext.getPageSize());
		List<Custominfo_02>custom=null;
		Custominfo custominfo=new Custominfo();
		custominfo.setFollowManId(followmanid);
		Date date =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");    
		String str=sdf.format(date);
		Date changeDate = new Date();
		try {
			changeDate=sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		custominfo.setPlanDate(date);
		if ("0".equals(src)) {
			try {
				custom = customMapper_02.queryToday(custominfo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (Custominfo_02 custominfo_custom : custom) {
				System.err.println(custominfo_custom.getPlanDate());
			}
		}else if("1".equals(src)){
			try {
				custom = customMapper_02.queryNotToday(custominfo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if("2".equals(src)){
			custominfo.setStatu("2");
			try {
				custom = customMapper_02.queryTodayByDate(custominfo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if("3".equals(src)){
			try {
				custom = customMapper_02.queryMonth(custominfo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			return null;
		}
		return custom;
		
	}
}
