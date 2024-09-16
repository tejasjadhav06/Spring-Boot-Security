package com.example.Spring_Boot_Custom_Login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Custom_login_Controller {

	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		return "Hello Tejas " + request.getSession().getId();
	}
}
