package com.hspedu.innerclass_;

public class StaticlnnerClass01 {
	public static void main(String[] args) {
		Outer10 outer10 = new Outer10();
		outer10.m1();

		Outer10.Inner10 inner10 = new Outer10.Inner10();
		inner10.say();
		Outer10.Inner10 inner102 = outer10.getInner10();
		inner102.say();
		Outer10.Inner10 inner10_ = Outer10.getInner10();
		inner10_.say();
	}

}

class Outer10 {
	private int n1 = 10;
	private static String name = "jack";

	private static void cry() {

	}

	static class Inner10 {
		private static String name = "mary";
		public void say() {
			System.out.println(name+"  外部类name="+Outer10.name);
			cry();
		}
	}

	public static Inner10 getInner10() {
		return new Inner10();
	}

	public void m1() {
		Inner10 inner10 = new Inner10();
		inner10.say();
	}
}