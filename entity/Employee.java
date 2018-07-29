package com.hwua.entity;

public class Employee {
    private Long id;

    private String username;

    private String pass;

    private String nickname;

    private String realName;

    private Long jobInfoId;

    private Long departmentId;

    private String phoneNo;

    private String officeTel;

    private String workstatu;
    
	public Employee() {
		super();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	

	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getRealName() {
		return realName;
	}


	public void setRealName(String realName) {
		this.realName = realName;
	}


	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getJobInfoId() {
		return jobInfoId;
	}


	public void setJobInfoId(Long jobInfoId) {
		this.jobInfoId = jobInfoId;
	}


	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getOfficeTel() {
		return officeTel;
	}

	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}

	public String getWorkstatu() {
		return workstatu;
	}

	public void setWorkstatu(String workstatu) {
		this.workstatu = workstatu;
	}
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", pass=" + pass + ", nickname=" + nickname
				+ ", realname=" + realName + ", jobInfoId=" + jobInfoId + ", departmentId=" + departmentId
				+ ", phoneNo=" + phoneNo + ", officeTel=" + officeTel + ", workstatu=" + workstatu + "]";
	}
	
	

}