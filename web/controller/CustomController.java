package com.hwua.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*import java.util.Date;*/
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.entity.Custom;
import com.hwua.entity.Custominfo_02;
import com.hwua.entity.Employee;
import com.hwua.entity.PageBean;
import com.hwua.filter.RegexMatches;
import com.hwua.service.CustomService;


@Controller
public class CustomController {
	@InitBinder    
    protected void initBinder(HttpServletRequest request,WebDataBinder binder) {
	
		
		String createdate = request.getParameter("createdate");
		if(createdate!=null&&createdate.contains("-")){
			binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));    
		}else{
			binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd"), true));    
		}
	}

		@Resource(name="customService")
		private CustomService cs;		
		
		//添加用户
		@RequestMapping("insertCustom")//uri=/register.do
		@ResponseBody
		public int insertCustom(Custom custom){
			System.err.println(custom.getCustomStatu());
			int result = 0;
			Date date = new Date();
			
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");    
			String str=sdf.format(date);
			Date changeDate = new Date();			
				try {
					changeDate=sdf.parse(str);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			custom.setCreateDate(changeDate);
			Custom custom_c = null;  
			custom_c = cs.checkCustom(custom);
			if (custom_c!=null) {
				return 0 ;
			}
			result = cs.insertCustom(custom);
			return result;
		}
		
		//查询所有
		@RequestMapping("queryCustom")
		@ResponseBody
		public PageBean<Custom> queryAllCustom(){
			List<Custom> list = cs.queryAllCustom();
			PageBean<Custom>pageBean=new PageBean<>(list) ;
			return pageBean;
		}
		//更新顾客信息
		@RequestMapping("updateCustom")
		@ResponseBody
		public String updateCustom(Custom custom){
			int row=0;
			row=cs.updateCustom(custom);
			return null;
		}
		//顾客类型
		@RequestMapping("customInfo")
		@ResponseBody
		public PageBean<Custominfo_02>updateCustom(String src,String followmanid){
			if (!"".equals(followmanid)) {
				long parseLong =Long.parseLong(followmanid);
			}
			long parseLong =Long.parseLong(followmanid);
			List<Custominfo_02> custom =null;
			custom =cs.customInfo(src,parseLong);
			return new PageBean<>(custom);
			
		}
		/*public PageBean<Custominfo_custom> updateCustom(String src ,String followmanid) {
			if (!"".equals(followmanid)) {
				long parseLong = Long.parseLong(followmanid);
			}
			long parseLong = Long.parseLong(followmanid);
			List<Custominfo_custom> custom = null;
			custom = cs.customInfo(src,parseLong);
			System.err.println(src);
			System.err.println(followmanid);
			return new PageBean<>(custom);
			
		}*/
}
