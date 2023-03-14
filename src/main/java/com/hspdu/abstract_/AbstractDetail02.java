package com.hspdu.abstract_;

public class AbstractDetail02 {
	public static void main(String[] args) {
		System.out.println("hello");
	}

}

abstract class E {
	public abstract void hi();
}

class F extends E {
	public void hi() {

	}
}

abstract class D {
	public int n1 = 10;
	public static String name = "hspedu";

	public void hi() {
		System.out.println("hi");
	}

	public abstract void hello();

	public static void ok() {
		System.out.println("ok");
	}

}