package com.dailycodebuffer.springboottutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.springboottutorial.exception.DepartmentNotFoundException;
import com.dailycodebuffer.springboottutorial.model.Department;
import com.dailycodebuffer.springboottutorial.service.iDepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private iDepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long DepartmentId) throws DepartmentNotFoundException {
		return departmentService.fetchDepartmentById(DepartmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long DepartmentId) {
	 departmentService.deleteDepartmentById(DepartmentId);
		return "Succesfully Deleted the data with this id::"+DepartmentId;	
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartmentById(@PathVariable("id") Long DepartmentId,@RequestBody Department department) {
		return departmentService.updateDepartmentById(DepartmentId,department);
	}
	
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String DepartmentName) {
		return departmentService.fetchDepartmentByName(DepartmentName);
	}
}
