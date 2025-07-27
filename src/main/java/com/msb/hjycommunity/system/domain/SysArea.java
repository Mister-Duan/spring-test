package com.msb.hjycommunity.system.domain;

import java.io.Serializable;
import java.util.List;

public class SysArea implements Serializable {
	
	private static final long serialVersionUID = 6036753090530446171L;
	
	/**
	 * 城市编码
	 */
	private Integer code;
	
	/**
	 * 城市名称
	 */
	private String name;

	private  Integer parentCode;
	
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParentCode() {
		return parentCode;
	}
	
	public void setParentCode(Integer parentCode) {
		this.parentCode = parentCode;
	}
}

