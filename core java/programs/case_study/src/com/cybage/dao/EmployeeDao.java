package com.cybage.dao;





import com.cybage.model.Employee;


public interface EmployeeDao {
    public void add(Employee emp, String type) throws Exception;
    public void delete(int id) throws Exception;
    public void display() throws Exception;
	public void update(int id, String name, String address) throws Exception;
}