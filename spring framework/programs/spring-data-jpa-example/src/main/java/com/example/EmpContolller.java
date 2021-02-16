package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpContolller {

	@Autowired
	EmployeeRepository er;

	// add employee
	@RequestMapping(path = "/employee/{name}", method = RequestMethod.POST)
	public String addEmployee(@PathVariable String name) {
		er.save(new Employee(name));
		return name;
	}

	// get employee
	@RequestMapping(path = "/employee", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getAllEmployee() {
		return er.findAll();
	}

	// get only single employee
	@RequestMapping(path = "/employee/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return er.findById(id);
	}

	// delete employee
	@RequestMapping(path = "/employee/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteEmployeeById(@PathVariable int id) {
		er.deleteById(id);
	}

	// update employee
	@RequestMapping(path = "/employee/{id}/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public void updateEmployee(@PathVariable int id, @PathVariable String name) {
		er.save(new Employee(id, name));
	}

	// count employee
	@RequestMapping("/count")
	@ResponseBody
	public long getCount() {
		return er.count();
	}

	// find by name
	@RequestMapping(path = "/employee/name", method = RequestMethod.GET)
	@ResponseBody
	public List<Employee> getEmployeeByName(@RequestParam(value = "name") String name) {
		return er.findByName(name);
	}
}
