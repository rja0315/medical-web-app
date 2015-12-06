package com.rja0315.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rja0315.entity.User;
import com.rja0315.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public User contsruct(){
	return new User();
		
	}
	
	@RequestMapping("/users")
	public String users(Model model){
		
		model.addAttribute("users", userService.findAll());
		return "users";
	}
	
	@RequestMapping("/users/{id}")
	public String detail(Model model, @PathVariable int id){
		model.addAttribute("user", userService.findOneWithRecords(id));
		return "user-detail";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String doRegister(@ModelAttribute("user") User user){
		userService.save(user);
		return "user-register";
	}
	@RequestMapping("/register")
	public String showRegister(){
		return "user-register";
	
		
	}
}
