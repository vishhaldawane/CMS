package com.cms.test;

import com.cms.service.DepartmentService;
import com.cms.service.DepartmentServiceImpl;

public class DepartmentServiceTest {
	public static void main(String[] args) {
		
		
		DepartmentService deptService = new DepartmentServiceImpl();
		deptService.findAllDepartmentsService();
		
	}
}
