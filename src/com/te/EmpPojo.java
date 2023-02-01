package com.te;

public class EmpPojo {
	public EmpPojo() {
		// TODO Auto-generated constructor stub
	}

	private String employeeName;
	private String emailId;
	private long mobileNo;
	private String employeeAddress;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public EmpPojo(String employeeName, String emailId, long mobileNo, String employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "[Name=" + employeeName + ", Email Id=" + emailId + ", Mobile No=" + mobileNo + ", Address="
				+ employeeAddress + "]";
	}

}
