package com.hwua.entity;

import java.util.Date;

public class Consultrecord {
    private Long id;

    private Long customId;

    private String consultStatu;

    private Long consultManId;

    private Date consultDate;

    private String result;

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

	public String getConsultStatu() {
		return consultStatu;
	}

	public void setConsultStatu(String consultStatu) {
		this.consultStatu = consultStatu;
	}
	public Long getConsultManId() {
		return consultManId;
	}
	public void setConsultManId(Long consultManId) {
		this.consultManId = consultManId;
	}

	public Date getConsultDate() {
		return consultDate;
	}

	public void setConsultDate(Date consultDate) {
		this.consultDate = consultDate;
	}

	public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}