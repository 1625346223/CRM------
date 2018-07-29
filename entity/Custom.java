package com.hwua.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.org.apache.bcel.internal.generic.NEW;

//客户基础信息表
public class Custom {
    
	//客户编号
	private Long id;
	//客户姓名
    private String name;
    //教育水平
    private String education;
    //手机
    private String phoneNo;
    //qq
    private String qq;
    //邮箱
    private String email;
    //客户状态客户状态:0 新增未上门 1新增已上门 2：销售跟进中 3：咨询跟进中 4：死单 5：已报名 
    private String customStatu;
    //创建日期
    private Date createDate;
    
    //private String createDatef;
    //邀请人姓名
    private String invitename;
	
    public Custom() {
		super();
	}
	
    public Custom(Long id, String name, String education, String phoneNo, String qq, String email, String customStatu,
			Date createDate, String inviteName) {
		super();
		this.id = id;
		this.name = name;
		this.education = education;
		this.phoneNo = phoneNo;
		this.qq = qq;
		this.email = email;
		this.customStatu = customStatu;
		this.createDate = createDate;
		this.invitename = invitename;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomStatu() {
		return customStatu;
	}

	public void setCustomStatu(String customStatu) {
		this.customStatu = customStatu;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	public Date getCreateDate() {
		return createDate; 
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
		
	}
	public String getInvitename() {
		return invitename;
	}

	public void setInvitename(String invitename) {
		this.invitename = invitename;
	}

	@Override
	public String toString() {
		return "Custom [id=" + id + ", name=" + name + ", education=" + education + ", phoneNo=" + phoneNo + ", qq="
				+ qq + ", email=" + email + ", customStatu=" + customStatu + ", createDate=" + createDate
				+ ", invitename=" + invitename + "]";
	}

    
}