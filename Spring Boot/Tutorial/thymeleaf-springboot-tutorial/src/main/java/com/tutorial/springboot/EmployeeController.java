package com.tutorial.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Reynold", "Yehezkiel", "reynold@gmail.com"));
		employees.add(new Employee("Uzumaki", "Naruto", "narto@gmail.com"));
		employees.add(new Employee("Uchiha", "Sasuke", "saskeh@gmail.com"));
		model.addAttribute("employees", employees);
		return "iteration";
	}
}
