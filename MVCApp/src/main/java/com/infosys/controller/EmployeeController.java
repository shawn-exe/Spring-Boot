package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.infosys.entities.Employee;
import com.infosys.repository.EmployeeRepository;
import com.infosys.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	//--If we use empRepo.findall , this is not required
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@GetMapping("/employees")
	public String ListAllEmployees(Model model)
	{
		model.addAttribute("employees",empService.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/employees/new")
	public String AddNewEmployee(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("employee",emp);
		return "newEmployee";
	}

	//Handler func for adding new employee
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee emp)
	{
		empService.saveEmployee(emp);
		return "redirect:/employees";
	}
	
	@GetMapping("employees/edit/{id}")
	public String editEmployeeForm( @PathVariable Long id ,Model model)
	{
		model.addAttribute("employee",empService.getEmployeeById(id));
		return "edit_employee";
	}
	
	@PostMapping("/saveEmployee/{id}")
	public String updateEmployee(@PathVariable Long id,@ModelAttribute("employee") Employee employee,Model model)
	{
		Employee existingEmployee = empService.getEmployeeById(id);
		existingEmployee.setEmpName(employee.getEmpName());
		existingEmployee.setEmpDept(employee.getEmpDept());
		existingEmployee.setEmpEmail(employee.getEmpEmail());
		empService.updateEmployee(existingEmployee);
		return "redirect:/employees";
	}
	
	
	@GetMapping("employees/delete/{id}")
	public String deleteEmployee( @PathVariable Long id)
	{
		empService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
	

	
}
