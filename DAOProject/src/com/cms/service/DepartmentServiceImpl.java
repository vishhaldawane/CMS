package com.cms.service;

import java.util.List;

import com.cms.dao.DepartmentDAO;
import com.cms.dao.DepartmentDAOImpl;
import com.cms.pojo.Department;

			 //ATMClient
public class DepartmentServiceImpl implements DepartmentService {

	//ATMServer
	DepartmentDAO deptDAO = new DepartmentDAOImpl();
	
	@Override		//withdraw <-- of ATMClient's
	public void findAllDepartmentsService() {
		
												//withdraw <--ATMServer's
		List<Department> deptList = deptDAO.selectDepartments();
		
		for(Department dept : deptList) {
				System.out.println("Dept No   : "+dept.getDepartmentNumber());
				System.out.println("Dept Name : "+dept.getDepartmentName());
				System.out.println("Dept Loc  : "+dept.getDepartmentLocation());			
		}

	}

}
