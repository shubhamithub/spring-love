package com.shubhamithub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shubhamithub.LoveCalculatorApp.api.CommunicationDTO;
import com.shubhamithub.LoveCalculatorApp.api.Phone;
import com.shubhamithub.LoveCalculatorApp.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		System.out.println("insde showRegistrationPage method	 ");
		
		//load the save user  data from database
		Phone phone =new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("8871397667");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		userRegistrationDTO.setDto(communicationDTO);
		
		
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO userRegistrationDTO) {
		System.out.println("insde processUserReg method	 ");
		
		// save the dto object in our database
		
		
		return "registration-success";
	}

}
