package com.hwua.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Custominfo {
    private Long id;

    private Long customId;

    private Long followManId;

    private String statu;

    private Date startDate;

    private Date planDate;

    private Date lastFollowDate;

    private String mark;

    private BigDecimal amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Long getCustomId() {
		return customId;
	}

	public void setCustomId(Long customId) {
		this.customId = customId;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

    
	public Long getFollowManId() {
		return followManId;
	}

	public void setFollowManId(Long followManId) {
		this.followManId = followManId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getPlanDate() {
		return planDate;
	}

	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}

	public Date getLastFollowDate() {
		return lastFollowDate;
	}

	public void setLastFollowDate(Date lastFollowDate) {
		this.lastFollowDate = lastFollowDate;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

    
}