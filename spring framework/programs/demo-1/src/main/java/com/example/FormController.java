package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class FormController {
	
	@RequestMapping(path = "/showform")
	public String showForm(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp", emp);
		return "show-form";
	}
	
	@RequestMapping(path = "/submit-form", method = RequestMethod.POST)
	public void submitForm(@ModelAttribute("emp") Employee emp) {
//			@SessionAttribute int sessionid
//			) {
		//after getting data we will save in db
		System.out.println(emp.toString());
	}
}