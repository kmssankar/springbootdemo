package org.kms.springboot.Springbootdemo.controller;

import java.util.Date;

import org.kms.springboot.Springbootdemo.dto.WelcomeIndex;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String getIndex() {
		return "This is a Test Page !! -" + new Date();
	}

	@GetMapping("/error")
	public String geterror() {
		
		return "setupprice";
	}

}
