package com.cybage;

public abstract class employee { //class which is incomplete
    //properties, instance variables
    private int id;
    private String name;
    private String address;
    
    private int generateId(){
    	return (int) (Math.round(Math.random()*100));
    }
    
    //constructor, constructor overloading
    public employee(){
    	System.out.println("empty object created");
        this.id = 456;
        this.name = null;
        this.address = null;
    }
    public employee(String name, String address){  //local variable
        System.out.println("object with value created");
    	this.id = 456;//generateId();
        this.name = name;
        this.address = address;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    
   
    public String toString() {
    	return "Employee [id: "+ this.id+ ", name: "+ this.name + ",address: "+this.address+ "]";
    }
    
    public abstract int getcompensation(); // no definition
}