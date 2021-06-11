package com.dailycodebuffer.springboottutorial.service;

import java.util.List;

import com.dailycodebuffer.springboottutorial.exception.DepartmentNotFoundException;
import com.dailycodebuffer.springboottutorial.model.Department;

public interface iDepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartmentById(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);
}
