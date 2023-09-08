package com.cms.myexceptions;


//unchecked
public class DepartmentNotFoundException extends RuntimeException {
	public DepartmentNotFoundException(String msg) {
		super(msg);
	}
}
