package com.hwua.service;

import java.sql.SQLException;

import com.hwua.entity.Consultrecord;

public interface ConsultrecordService {
	/**
	 * 分配新增已上门
	 * @return int
	 * @throws
	 */
	public abstract int allotToConsult(Consultrecord consultrecord);
	/**
	 * 分配新增未上门
	 * @return int
	 * @throws
	 */
	public abstract int allotCustom();
	
}
