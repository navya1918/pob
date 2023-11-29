package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/api/departments")
public class DepartmentController {

	@Autowired
	
	DepartmentService departmentService;
	
	 @PostMapping
	    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
	        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
	        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	    }

	    // Build get department rest api
	    @GetMapping("{department-code}")
	    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode){
	        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
	        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
	    }
}
