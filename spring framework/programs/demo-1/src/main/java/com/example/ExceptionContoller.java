package com.example;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionContoller {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleError(Exception ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("msg",ex.getLocalizedMessage());
		return mv;
	}
}
