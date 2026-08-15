package com.mvcspring.controller;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvcspring.DAOImple.EmployeeDAOImple;
import com.mvcspring.cofig.MyConfiguration;
import com.mvcspring.entity.Employee;

	
@Controller
public class MyController {
	private AnnotationConfigApplicationContext apx;
	EmployeeDAOImple edao;
	public MyController() {
		apx = new  AnnotationConfigApplicationContext (MyConfiguration.class);
		 edao = (EmployeeDAOImple) apx.getBean("edao");
	}
	@RequestMapping("/")
	public String home(Model model) {
		ArrayList<Employee> employeeList = edao.fetchAll();
		
		model.addAttribute("employeeList",employeeList);
		
		return "home";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/edit")
	public String edit(int id) {
		
		return "edit";
	}
	
	@RequestMapping("/display")
	public String display(
							@RequestParam(name="id") int id,
							@RequestParam(name="name") String name,
							@RequestParam(name="email") String email,
							@RequestParam(name="design") String design,
							@RequestParam(name="address") String address, 
							Model model) {
		

		
		Employee e = new Employee(id,name,email,design,address);
//		 e.setId(id);
//		 e.seteName(name);
//		 e.seteEmail(email);
//		 e.seteDesign(design);
//		 e.seteAddress(address);
		 
		EmployeeDAOImple edao = (EmployeeDAOImple) apx.getBean("edao");

		edao.insert(e);

		model.addAttribute("id",id);
		model.addAttribute("name",name);
		model.addAttribute("email",email);
		model.addAttribute("design",design);
		model.addAttribute("address",address);
		
	
		
		return "redirect:/";
		
	}
}
