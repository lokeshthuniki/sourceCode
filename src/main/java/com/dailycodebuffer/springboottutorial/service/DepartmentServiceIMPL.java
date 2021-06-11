package com.dailycodebuffer.springboottutorial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.springboottutorial.Repository.DepartmentRepository;
import com.dailycodebuffer.springboottutorial.exception.DepartmentNotFoundException;
import com.dailycodebuffer.springboottutorial.model.Department;

@Service
public class DepartmentServiceIMPL implements iDepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		return departmentRepository.findAll();
	}
	@Override
	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException {
		Optional<Department> department = departmentRepository.findById(departmentId);
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department Not Found");
		}
		return department.get();
	}
	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}
	@Override
	//NULL CHECK AND BLANK CHECK
	public Department updateDepartmentById(Long departmentId, Department department) {
		Department departmentDb = departmentRepository.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			departmentDb.setDepartmentName(department.getDepartmentName());
		}
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			departmentDb.setDepartmentCode(department.getDepartmentCode());
		}
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			departmentDb.setDepartmentAddress(department.getDepartmentAddress());
		}
		return departmentRepository.save(departmentDb);
		}
	@Override
	public Department fetchDepartmentByName(String departmentName) {
		return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
}
}
