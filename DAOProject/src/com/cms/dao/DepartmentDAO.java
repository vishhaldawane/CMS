package com.cms.dao;

import java.util.List;

import com.cms.pojo.Department;

//CRUD methods are here
public interface DepartmentDAO {

	void             insertDepartment(Department dept); //C
	Department       selectDepartment(int deptNumber);  //R
	List<Department> selectDepartments();               //R
	void             updateDepartment(Department dept); //U
	void             deleteDepartment(int deptNumber);  //D	
}
