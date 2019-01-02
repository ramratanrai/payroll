package com.example.payroll;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayrollController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee")
	public Optional<Employee> getEmployee(@RequestParam Integer id) {
		return employeeRepository.findById(id);
	}
	
	@PostMapping("/createEmployee")
	public void createEmployee(@RequestParam String name, @RequestParam String role) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setRole(role);
		employeeRepository.save(employee);
	}
}
