package com.cms.test;

import java.util.List;

import com.cms.dao.DepartmentDAO;
import com.cms.dao.DepartmentDAOImpl;
import com.cms.myexceptions.DepartmentNotFoundException;
import com.cms.pojo.Department;

public class DepartmentTest {

	public static void main(String[] args) {

		
		

		//POJI						POJIImpl
		DepartmentDAO deptDAO = new DepartmentDAOImpl();

		/*Department newDept = new Department();
		newDept.setDepartmentNumber(99);
		newDept.setDepartmentName("ORALS");
		newDept.setDepartmentLocation("Mumbai");
		*/
		deptDAO.deleteDepartment(99);

		System.out.println("* * * * * * * ");
		
		try {
			List<Department> deptList = deptDAO.selectDepartments();
			
				 //POJO
			for(Department dept: deptList) {
				System.out.println("Dept No   : "+dept.getDepartmentNumber());
				System.out.println("Dept Name : "+dept.getDepartmentName());
				System.out.println("Dept Loc  : "+dept.getDepartmentLocation());
			}
			
		} catch (DepartmentNotFoundException e) {
			System.out.println("SOME PROBLEM 1 : "+e);
		}
		catch(RuntimeException e) {
			System.out.println("SOME PROBLEM 2: "+e);

		}
		catch(Exception e) {
			System.out.println("SOME PROBLEM 3: "+e);

		}
		catch(Throwable e) {
			System.out.println("SOME PROBLEM 4: "+e);

		}
		
		System.out.println("END of main ");
	}

}
interface Swimming
{
	void swim();
}
interface Flying
{
	void fly();
}
interface Sleeping
{
	void sleep();
}

class Whale implements Swimming,Sleeping //isA
{
	public void swim() {
		System.out.println("Whale is swimming....");
	}
	public void sleep() {
		System.out.println("Whale is sleeping ....");
	}
}

class Swan implements Flying, Swimming, Sleeping //isA
{
	public void fly() {
		System.out.println("Swan is flying....");
	}
	public void swim() {
		System.out.println("Swan is swimming....");
	}
	public void sleep() {
		System.out.println("Swan is sleeping....");
	}
}
