package com.cybage;


import java.io.IOException;
import java.util.Scanner;

import com.cybage.exception.EmployeeException;
import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServieImpl;


public class UI {
    public static void main(String[] args) throws Exception {
        System.out.println("employee demo...");
        int id;
        String name,address,type;
        double compensation;
        
        
        EmployeeService empService = new EmployeeServieImpl();
        
//        try {
//            //add one regular employee
//            empService.add("reg101", "reg address", 123, "REG");            
//        }catch(EmployeeException | IOException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
//        
//        try {
//            //add one retired employee
//            empService.add("ret102", "ret address", 789, "RET");            
//        }catch(EmployeeException | IOException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
        
        
        try {
            empService.displayAll();    
        }catch (EmployeeException | IOException ee) {
            System.err.println(ee.getLocalizedMessage());
        }
        
        
//        try {
//        	empService.delete(10846);
//        	throw new EmployeeException("employee does not exist");
//        }catch(EmployeeException ee) {
//            System.err.println(ee.getLocalizedMessage());
//        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id");
        id = sc.nextInt();
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter address");
        address = sc.next();
        empService.update(id,name,address);
        	
      
       
    }
}
