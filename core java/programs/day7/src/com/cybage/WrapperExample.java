package com.cybage;

public class WrapperExample {
	public static void main(String[] args) {
		System.out.println("start");
		int salary = 123; //not part of integer pool
		
		
		//part of integer pool
		Integer iObj = new Integer(100);//created new object
		//Integer iObj1 = new Integer(200);
		Integer iObj1 = 12345; //values
		
		String name = new String("dm"); //always new object created
		String name1 = "dm";  //object will be created and placed in string pool
							// if already existing(in string pool) then we will reuse same object	
	
	
		System.out.println(iObj.MAX_VALUE);
		System.out.println(iObj.MIN_VALUE);
		
		System.out.println(iObj.hashCode());
		
		
		Integer sum = iObj+iObj1 ;  //auto-unboxing, auto-boxing
		Integer sum1 = iObj.intValue()+iObj1.intValue() ;  // auto-boxing
		Integer sum2 = new Integer(iObj.intValue()+iObj1.intValue()) ;  // no auto-boxing
		
		System.out.println(sum);
		//iobj+obj1 --> auto unboxing -> 300
		//200 need convert into object(sum) -> auto-boxing
		
		
	}
}
