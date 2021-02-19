package com.example;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

	
	@ExceptionHandler(value = Exception.class)
	public String handleUserException(Exception e) {
		return "something going wrong" + e.getLocalizedMessage();
	}

}
