package com.study.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.service.PortalService;

@Controller
@RequestMapping("/portal")
public class PortalController {

	
	@Autowired
	private PortalService portalService;
	
	//
	@PostConstruct
	public void init() {
		com.fasterxml.jackson.databind.exc.InvalidDefinitionException a;
		System.out.println("~~~~~~~~ initing ~~~~~~~~");
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello(@RequestParam(value = "words", defaultValue = "hehe") String message,
			HttpServletRequest request, Model model) {
		
		
		return "hello " + message;
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello2() {
		
		
		return "hello!";
	}


	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello3() {
		
		
		return portalService.getHelloMessage();
	}
	
	
}
