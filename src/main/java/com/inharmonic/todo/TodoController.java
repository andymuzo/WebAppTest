package com.inharmonic.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.inharmonic.login.LoginService;

@Controller
public class TodoController {
	
	// Set the login service - use Spring Autowiring
	
	@Autowired
	TodoService service;

	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.addAttribute("todos", service.retrieveTodos("inharmonic"));
		
		return "list-todos";
	}

}
