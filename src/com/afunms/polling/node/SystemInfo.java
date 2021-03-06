package com.afunms.polling.node;

/**
 * 
 * @descrition 系统信息
 * @author wangxiangyong 添加了一种ssh采集方式
 * @date Jun 15, 2013 10:37:05 AM
 */
public class SystemInfo {
	private String verdorID;
	private String productID;
	private String arrayWorldWideName;
	private String arraySerialNumber;
	private String alias;
	private String softwareRevision;
	private String commandexecutioTimestamp;
	private String sysName;// 系统名称
	private String sysContact; //
	private String sysLocation;// 系统位置
	private String sysInfo;// 系统信息
	private String proBrand;// 产品品牌
	private String scsiVendorId;// scsi 供应商ID
	private String enclosureCount;// 外壳数
	private String health;// 运行情况
	private String supportLocal;// 支持的语言

	public String getAlias() {
		return alias;
	}

	public String getArraySerialNumber() {
		return arraySerialNumber;
	}

	public String getArrayWorldWideName() {
		return arrayWorldWideName;
	}

	public String getCommandexecutioTimestamp() {
		return commandexecutioTimestamp;
	}

	public String getEnclosureCount() {
		return enclosureCount;
	}

	public String getHealth() {
		return health;
	}

	public String getProBrand() {
		return proBrand;
	}

	public String getProductID() {
		return productID;
	}

	public String getScsiVendorId() {
		return scsiVendorId;
	}

	public String getSoftwareRevision() {
		return softwareRevision;
	}

	public String getSupportLocal() {
		return supportLocal;
	}

	public String getSysContact() {
		return sysContact;
	}

	public String getSysInfo() {
		return sysInfo;
	}

	public String getSysLocation() {
		return sysLocation;
	}

	public String getSysName() {
		return sysName;
	}

	public String getVerdorID() {
		return verdorID;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void setArraySerialNumber(String arraySerialNumber) {
		this.arraySerialNumber = arraySerialNumber;
	}

	public void setArrayWorldWideName(String arrayWorldWideName) {
		this.arrayWorldWideName = arrayWorldWideName;
	}

	public void setCommandexecutioTimestamp(String commandexecutioTimestamp) {
		this.commandexecutioTimestamp = commandexecutioTimestamp;
	}

	public void setEnclosureCount(String enclosureCount) {
		this.enclosureCount = enclosureCount;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setScsiVendorId(String scsiVendorId) {
		this.scsiVendorId = scsiVendorId;
	}

	public void setSoftwareRevision(String softwareRevision) {
		this.softwareRevision = softwareRevision;
	}

	public void setSupportLocal(String supportLocal) {
		this.supportLocal = supportLocal;
	}

	public void setSysContact(String sysContact) {
		this.sysContact = sysContact;
	}

	public void setSysInfo(String sysInfo) {
		this.sysInfo = sysInfo;
	}

	public void setSysLocation(String sysLocation) {
		this.sysLocation = sysLocation;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public void setVerdorID(String verdorID) {
		this.verdorID = verdorID;
	}

}
