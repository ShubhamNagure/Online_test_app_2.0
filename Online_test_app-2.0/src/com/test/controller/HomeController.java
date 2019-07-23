package com.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.Users;
import com.test.serviceImpl.UsersService;


@Controller
public class HomeController {
	
	@Autowired
	private UsersService service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav= new ModelAndView("index");
		System.out.println("1.in user controller");
		return mav;
	}
	@RequestMapping("/new")
	public String newUserForm(Map<String, Object> model) {
		model.put("user", new Users());
		return "new_user";
	}
	@RequestMapping(value = "/save",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") Users user) {
		service.save(user);
		return "redirect:/";
		
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(@RequestParam String email,@RequestParam String pass) {
		boolean result=service.isAuthorised(email, pass);
		if(result==true) {
			return "LoginSuccess";
		}else if (result==false) {
			boolean res=service.checkAdmin(email, pass);
			if (res==true) {
				return "LoginSuccessAdmin";
			}
		}
		return "redirect:/";
		
	}
	
	
}
