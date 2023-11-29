package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dto.APIResponseDto;
import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repository.EmployeeRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	 
	 
	@Autowired
    private EmployeeRepository employeeRepository;

   // private RestTemplate restTemplate;
	@Autowired
    private WebClient webClient;
   // private APIClient apiClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee saveDEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(saveDEmployee);

        return savedEmployeeDto;
    }

   @CircuitBreaker(name= "${spring.application.name}",fallbackMethod = "getDefaultDepartment")
    @Override
    public APIResponseDto getEmployeeById(Long employeeId) {

      
        Employee employee = employeeRepository.findById(employeeId).get();
//     ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity("http://DEPARTMENT-SERVICE/api/departments/" + employee.getDepartmentCode(),
//                DepartmentDto.class);

//        DepartmentDto departmentDto = responseEntity.getBody();

       DepartmentDto departmentDto = webClient.get()
               .uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
               .retrieve()
                .bodyToMono(DepartmentDto.class)
               .block();


        EmployeeDto employeeDto = EmployeeMapper.mapToEmployeeDto(employee);

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployee(employeeDto);
        apiResponseDto.setDepartment(departmentDto);
        
        return apiResponseDto;
    }
   
   
   public APIResponseDto getDefaultDepartment(Long employeeId, Exception exception) {

       

       Employee employee = employeeRepository.findById(employeeId).get();

       DepartmentDto departmentDto = new DepartmentDto();
       departmentDto.setDepartmentName("R&D Department");
       departmentDto.setDepartmentCode("RD001");
       departmentDto.setDepartmentDescription("Research and Development Department");

       EmployeeDto employeeDto = EmployeeMapper.mapToEmployeeDto(employee);

       APIResponseDto apiResponseDto = new APIResponseDto();
       apiResponseDto.setEmployee(employeeDto);
       apiResponseDto.setDepartment(departmentDto);
       return apiResponseDto;
   }

   
}
