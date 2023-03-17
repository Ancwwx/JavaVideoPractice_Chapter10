package com.hspedu.homework_;

public class Homework05 {
	public static void main(String[] args) {
		A a = new A();
		a.f1();
	}

}

class A {
	private String name = "rock";

	public void f1() {

		class B {
			private final String name = "jack";

			public void show() {

				System.out.println(" B name = " + name + "\n A name = " + A.this.name);
			}
		}

		B b = new B();
		b.show();

	}
}