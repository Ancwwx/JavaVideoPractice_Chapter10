package com.hspedu.innerclass_;

public class AnonymouslnnerClass {
	public static void main(String[] args) {
		IA tiger = new IA() {
			public void cry() {
				System.out.println("老虎叫..");
			}
		};
		tiger.cry();
		
		Father father=new Father("jack") {
			public void test() {
			System.out.println("匿名内部类重写了test方法");
			}
		};
		//System.out.println("father对象的运行类型="+father.getClass());
		father.test();
		
		Animal animal=new Animal() {
			public void eat() {
				System.out.println("小狗吃骨头");
			}
		};
		animal.eat();
	}

}

class Outer04 {
	private int n1 = 10;

	public void method() {

	}
}

interface IA {
	public void cry();
}

class Father {
	public Father(String name) {

	}

	public void test() {

	}
}
abstract class Animal{
	abstract void eat() ;
}