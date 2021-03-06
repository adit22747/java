package com.cybage.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
	private static final int Integer = 0;

	public static void main(String[] args) {
//		Arithmetic cal = new Arithmetic(){
//		
//			public int add(int a ,int b){
//				return a+b;
//			}
//		};
		
		
		
//		Arithmetic cal = (a,b) -> a+b;        //lambda expression
//		System.out.println(cal.add(2,3));
		
		
//		Function<Integer,Integer> cal = new Function<Integer,Integer>(){
//
//			@Override
//		public Integer apply(Integer t) {
//				return t++;
//			}
//		
//	};
		
		
//		Function<Integer,Integer> cal = (Integer t) -> t++;
//		
//		System.out.println(cal.apply(10));
		
		
//		
//		BiFunction<Integer, Integer, Integer> bifun = new BiFunction<Integer, Integer, Integer>() {
//			
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				return t+u;
//			}
//		};
//		System.out.println(bifun.apply(10,20));
		
		
//		Predicate<Integer> checkingAge = new Predicate<Integer>() {
//			
//			public boolean test(Integer age){
//				return age > 18;
//			}
//		};
//		
//		Predicate<Integer> checkingAge = (age) -> age>18;
//		System.out.println(checkingAge.test(35));
		
		
//		Consumer<String> printer = new Consumer<String>() {
//			public void accept(String t){
//				System.out.println("value :"+t);
//			}
//		};
//		printer.accept("hello");
		
		
		
//		//get random number
//		Supplier<Double> numGenerator = new Supplier<Double>() {
//			
//			@Override
//			public Double get() {
//				return Math.random();
//			}
//		};
//		System.out.println(numGenerator.get());
		
		Function<Integer, Integer> cal = (t) -> t++;            
        System.out.println(cal.apply(10));
        
        BiFunction<Integer, Integer, Integer> biFun =  (t, u) -> t+u;            
        System.out.println(biFun.apply(10, 20));
        
        //want to check age is greater than 18
        Predicate<Integer> checkingAge = (age) ->  age > 18;            
        System.out.println(checkingAge.test(35));        
        
        //consumer
        Consumer<String> printer = (t) -> System.out.println("we are just printing value... "+ t);
        printer.accept("dm jadhav");
        
        //get random number
        Supplier<Double> numGenerator = () -> Math.random(); 
        System.out.println(numGenerator.get());
        
        DoubleSupplier  numGenerator1 = () -> Math.random(); 
        System.out.println(numGenerator1.getAsDouble());
    
	}
	
}
