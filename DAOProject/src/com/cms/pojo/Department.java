package com.cms.pojo; //1. Package


//POJO similar to the DEPT table 
public class Department { //2. a public class | same as dept table

	//3. private data
	private int departmentNumber; //same as deptno
	private String departmentName; //same as dname
	private String departmentLocation; //same as loc

	//4. public no-arg constructor
	public Department() {
		System.out.println("Department() ctor...");
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	//5. setter and getter
	
}

