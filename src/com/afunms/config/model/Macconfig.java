package com.afunms.config.model;

import com.afunms.common.base.BaseVo;

/**
 * 
 * mac 地址管理bean
 * 
 * @author konglq
 * 
 */

public class Macconfig extends BaseVo {

	private int id; // id
	private String mac;// mac 地址
	private int discrictid; // 地区id
	private int deptid; // 部门id
	private int employeeid; // 员工id
	private String macdesc; // mac 址描述

	public int getDeptid() {
		return deptid;
	}

	public int getDiscrictid() {
		return discrictid;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public int getId() {
		return id;
	}

	public String getMac() {
		return mac;
	}

	public String getMacdesc() {
		return macdesc;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public void setDiscrictid(int discrictid) {
		this.discrictid = discrictid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public void setMacdesc(String macdesc) {
		this.macdesc = macdesc;
	}

}
