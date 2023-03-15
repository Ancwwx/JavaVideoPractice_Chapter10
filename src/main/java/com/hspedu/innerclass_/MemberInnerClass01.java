package com.hspedu.innerclass_;

public class MemberInnerClass01 {
	public static void main(String[] args) {
		Outer08 outer08 = new Outer08();
		outer08.t1();
		Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
		inner08Instance.say();
		Outer08.Inner08 inner08 = outer08.new Inner08();
		inner08.say();
	}

}

class Outer08 {

	private int n1 = 10;
	public String name = "张三";

	private void hi() {
		System.out.println("hi");
	}

	public class Inner08 {
		private int n1 = 66;
		protected double sal = 9.8;

		public void say() {
			System.out.println("Outer08的 n1 =" + n1 + " outer08的 name=" + name + " 外部n1=" + Outer08.this.n1);
			hi();
		}
	}

	public Inner08 getInner08Instance() {
		return new Inner08();
	}

	public void t1() {
		Inner08 inner08 = new Inner08();
		inner08.say();
		System.out.println(inner08.sal);
	}
}