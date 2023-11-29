package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.DepartmentMapper;
import com.example.demo.dto.DepartmentDto;
import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository repo;
	
	
	 public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

	        // convert department dto to department jpa entity
	        Department department = DepartmentMapper.mapToDepartment(departmentDto);

	        Department savedDepartment = repo.save(department);

	        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

	        return savedDepartmentDto;
	    }

	    @Override
	    public DepartmentDto getDepartmentByCode(String departmentCode) {

	        Department department = repo.findByDepartmentCode(departmentCode);

	        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

	        return departmentDto;
	    }

}
