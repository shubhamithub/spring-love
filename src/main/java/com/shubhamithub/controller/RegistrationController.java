package com.shubhamithub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shubhamithub.LoveCalculatorApp.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		return "registration-success";
	}

}
