package com.study.service;

import org.springframework.stereotype.Service;

@Service
public class PortalService {

	public String getHelloMessage() {
		String message = "Hello";
		message += " ~~~ ";
		message += "$22222222$";
		return message;
	}

}
