package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	
	@Autowired
	ProductServiceImpl servimpl = new ProductServiceImpl();
	
	List<Product> products;
	
	@RequestMapping(path = "/")
	public ModelAndView home() {
		products = servimpl.listProduct();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listprod",products);
		return mav;
	}
	
	@RequestMapping(path = "/addProduct")
	public String addProduct(Model model) {
		Product p = new Product();
		model.addAttribute("prod",p);
		return "add-product";
	}
	
	@RequestMapping(path = "/submit-form", method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("prod") Product prod) {
		servimpl.addProduct(prod);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteProduct(@RequestParam int id) {
		servimpl.deleteProduct(id);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/edit")
	public String editProduct(@RequestParam int id,Model model ) {
		Optional<Product> p = servimpl.getId(id);
		model.addAttribute("prod",p);
		return "edit_product";
		
	}
}
