package com.cybage.service;


import java.io.IOException;


import com.cybage.exception.EmployeeException;



public interface EmployeeService {
    public abstract void add(String name, String address, int comp, String type) throws EmployeeException, IOException, Exception;
    public abstract void displayAll() throws Exception;
    public abstract void displayComp();
    public abstract void delete(int id) throws Exception;
	public abstract void update(int id, String name, String address) throws Exception;
}
