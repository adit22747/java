package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex() {
		return "index";
	}

	/*
	 * @RequestMapping(value = "/home/{id}/{name}", method = RequestMethod.GET)
	 * @ResponseBody //response will be added inside response object public String
	 * public getIndex1(@PathVariable int id, @PathVariable String name) {
	 * System.out.println("value from path:" + id + name); return
	 * "value from server" + id + name; }
	 */

//	@RequestMapping(value = "/home/{id}/{name}", method = RequestMethod.GET)
//	public ResponseEntity<String> getIndex1(@PathVariable int id, @PathVariable String name) {
//		return new ResponseEntity<String>("data from server " + id + name, HttpStatus.FOUND);
//	}
	
	
	@RequestMapping(value = "/home/{id}/{name}", method = RequestMethod.GET)
	public ResponseEntity<String> getIndex1(Employee emp) {
		return new ResponseEntity<String>("data from server " + emp, HttpStatus.OK);
	}
	
	
	//spring manner
//	@RequestMapping(path ="/emp", method = RequestMethod.GET)
//	public String getIndex3(Model model) {
//		model.addAttribute("id", 123);
//		model.addAttribute("name", "dm101");
//		return "viewemp";
//	}
//	
//	
//	//advance java using jsp and servlet
//	@RequestMapping(path ="/emp1", method = RequestMethod.GET)
//	public String getIndex4(HttpServletRequest req) {
//		req.setAttribute("id", 123);
//		req.setAttribute("name", "dm102");
//		return "viewemp";
//	}
	
	
	@RequestMapping(path ="/emp", method = RequestMethod.GET)
	public ModelAndView getIndex3() {
		ModelAndView mv = new ModelAndView("viewemp");
		mv.addObject("id", 123);
		mv.addObject("name", "dm101");
		return mv;
	}
	
	
}
