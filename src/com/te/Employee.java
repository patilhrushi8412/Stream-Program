package com.te;

public class Employee {
	
	public Employee() {
	// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", Name=" + employeeName + ", Salary=" + employeesalary
				+ ", Address=" + employeeAddress + ", EmailId=" + emailId + ", Mobile No=" + mobileNo
				+ ", Designation=" + designation + "]";
	}

	private int id;
	private String employeeName;
	private int employeesalary;
	private String employeeAddress;
	private String emailId;
	private long mobileNo;
	private String designation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int id, String employeeName, int employeesalary, String employeeAddress, String emailId,
			long mobileNo, String designation) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeesalary = employeesalary;
		this.employeeAddress = employeeAddress;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.designation = designation;
	}
	
	
}
