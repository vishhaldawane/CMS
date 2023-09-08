package com.cms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cms.myexceptions.DepartmentNotFoundException;
import com.cms.pojo.Department;

public class DepartmentDAOImpl implements DepartmentDAO {

	Connection conn;
	
	public DepartmentDAOImpl() {
		try {
			System.out.println("Trying to load the database driver...");
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Database driver loaded...");
			
		    //     2. GET THE CONNECTION
			System.out.println("Trying to connect to the database...");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=root123");
				
			System.out.println("Connected to the DB : "+conn);
		   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void insertDepartment(Department dept) {
		
		try {
			PreparedStatement pst = conn.prepareStatement("INSERT INTO DEPT "
					+ "VALUES (?,?,?)");
			
			pst.setInt(1, dept.getDepartmentNumber());
			pst.setString(2, dept.getDepartmentName());
			pst.setString(3, dept.getDepartmentLocation());

			int rows = pst.executeUpdate();
			System.out.println("Rows added : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Department selectDepartment(int deptNumber) {
		Department dept =null;
		 try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM dept where deptno="+deptNumber);
			if(result.next()) {
				dept = new Department();
				dept.setDepartmentNumber(result.getInt(1));
				dept.setDepartmentName(result.getString(2));
				dept.setDepartmentLocation(result.getString(3));
			} 
			else {
				throw new DepartmentNotFoundException("The department with this id doesnot exists !!!! "+deptNumber);
			}
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dept;
	}

	@Override
	public List<Department> selectDepartments() {
		// TODO Auto-generated method stub
		Department dept =null;
		List<Department> list = new ArrayList<Department>();
		
		 try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM dept");
			
			while(result.next()) {
				dept = new Department(); //blank object
				dept.setDepartmentNumber(result.getInt(1)); //fill up the object
				dept.setDepartmentName(result.getString(2));
				dept.setDepartmentLocation(result.getString(3));
				list.add(dept); //add this object to the array list..
			} 

			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateDepartment(Department dept) {
		
		try {
			PreparedStatement pst = conn.prepareStatement("update dept  "
					+ " set dname=?, loc=? where deptno=?");
			
			pst.setString(1, dept.getDepartmentName());
			pst.setString(2, dept.getDepartmentLocation());
			pst.setInt(3, dept.getDepartmentNumber());
			

			int rows = pst.executeUpdate();
			System.out.println("Rows updated : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteDepartment(int deptNumber) {

		try {
			PreparedStatement pst = conn.prepareStatement("delete from dept  "
					+ " where deptno=?");
			
			pst.setInt(1, deptNumber);

			int rows = pst.executeUpdate();
			System.out.println("Rows deleted : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
