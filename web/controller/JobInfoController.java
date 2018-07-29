package com.hwua.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.entity.Jobinfo;
import com.hwua.service.JobinfoService;


@Controller
public class JobInfoController {
	
	@Resource(name="jobinfoService")
	private JobinfoService jb;
	
	//查询职位
	@RequestMapping("getJobByDid")
	@ResponseBody
	public List<Jobinfo> getJobByDid(Long departmentId){
		List<Jobinfo> list = jb.queryDepartment(departmentId);
		return list;
	}

}
