package com.hwua.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hwua.entity.Consultrecord;
import com.hwua.entity.Custom;
import com.hwua.entity.Employee;
import com.hwua.service.ConsultrecordService;
import com.hwua.service.CustomService;

@Controller
public class ConsultrecordController {
	@Resource(name = "ConsultrecordService")
	private ConsultrecordService ccs;
	//allotToConsult
	@RequestMapping("allotToConsult")
	@ResponseBody
	public int allotToConsult(Consultrecord consultrecord) {
		consultrecord.setConsultStatu("0");
		System.err.println(consultrecord);
		
		int result = 0;
		result = ccs.allotToConsult(consultrecord);
		return result;
	}
	//allotCustom
	@RequestMapping("allotCustom")
	@ResponseBody
	public int allotCustom() {		
		int result = 0;
		result = ccs.allotCustom();
		return result;
	}
}
