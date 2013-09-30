package com.avior.hw;

public class Greeter{
	private String name;

	public void setNameToGreet(String name){
		this.name=name;
	}
	public void greetPerson(){
		System.out.println(name);
	}

}
