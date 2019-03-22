package com.varun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/homepage")
	public String getHomePage() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String getLoginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String getLogoutPage() {
		return "logout.jsp";
	}
}
