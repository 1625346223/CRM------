package com.hwua.service.Impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hwua.dao.ConsultrecordMapper;
import com.hwua.dao.CustomMapper;
import com.hwua.dao.CustominfoMapper;
import com.hwua.dao.EmployeeMapper;
import com.hwua.entity.Consultrecord;
import com.hwua.entity.Custom;
import com.hwua.entity.Custominfo;
import com.hwua.entity.Employee;
import com.hwua.service.ConsultrecordService;
@Service("ConsultrecordService")
@Transactional
public class ConsultrecordServiceImpl implements ConsultrecordService {
	@Resource
	private ConsultrecordMapper consultrecordMapper;
	@Resource
	private CustomMapper customMapper;
	@Resource
	private EmployeeMapper employeeMapper;
	@Resource
	private CustominfoMapper custominfoMapper;
	@Override
	public int allotToConsult(Consultrecord consultrecord) {
		int result = 0;
		System.err.println(consultrecord);
		Date date = new Date();
		consultrecord.setConsultDate(date);
		Consultrecord cc  = null;
		try {
			cc = consultrecordMapper.queryById(consultrecord.getCustomId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (cc!=null) {
			return 0;
		}
		try {
			customMapper.setStatu(consultrecord.getCustomId());
			result = consultrecordMapper.allotToConsult(consultrecord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public int allotCustom() {
		List<Custom> custom = null;
		List<Employee> employee = null;
		
			try {
				custom = customMapper.queryCustomByStatu();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				employee =employeeMapper.querySales();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		
		if (custom != null && employee != null) {

			for (int i = 0; i < custom.size(); i++) {		
				
				System.err.println(custom.get(i).getId()+"+"+employee.get(i%employee.size()).getId());
				Custominfo custominfo = new Custominfo();
				custominfo.setCustomId(custom.get(i).getId());
				custominfo.setFollowManId(employee.get(i%employee.size()).getId());
				Date date = new Date();
				custominfo.setStartDate(date);
				custominfo.setStatu("0");
				System.err.println(custominfo);
				try {
					int result = customMapper.changeStuta(custom.get(i).getId());
					int result2 = custominfoMapper.add(custominfo);
					System.out.println(result+""+result2);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
		return 1;
	}
}
