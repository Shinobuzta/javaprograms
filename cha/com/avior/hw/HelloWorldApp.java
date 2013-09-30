package com.avior.hw;

public class HelloWorldApp{
	public static void main(String args[]){
	
	Greeter greeter = new Greeter();
	greeter.setNameToGreet(args[0]);
	greeter.greetPerson();	

	}

}