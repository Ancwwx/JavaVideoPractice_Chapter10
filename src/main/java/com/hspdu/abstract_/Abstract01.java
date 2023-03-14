package com.hspdu.abstract_;

public class Abstract01 {

}

abstract class Animal {
	private String name;

	public Animal(String name) {

		this.name = name;
	}

//	public void eat() {
//		System.out.println("");
//	}
	public abstract void eat();

}