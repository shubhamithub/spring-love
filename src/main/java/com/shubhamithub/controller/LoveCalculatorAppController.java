package com.shubhamithub.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.shubhamithub.LoveCalculatorApp.api.UserInfoDTO;

@Controller
public class LoveCalculatorAppController {

	// Long Way
	@RequestMapping(method = RequestMethod.GET, value = "/showHomePage")
	public String showHomePage(Model model) {
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		model.addAttribute("userInfo", userInfoDTO);
		return "home-page";
	}

	// short way
	@RequestMapping(method = RequestMethod.GET, value = "/process-homepage")
	public String getResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);

			}
			return "home-page";

		}
		return "result-page";
	}

}
