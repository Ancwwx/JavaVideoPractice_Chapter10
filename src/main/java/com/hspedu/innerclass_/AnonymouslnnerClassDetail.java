package com.hspedu.innerclass_;

public class AnonymouslnnerClassDetail {
	public static void main(String[] args) {
		Outer05 outer05 = new Outer05();
		outer05.f1();
	}
}

class Outer05 {
	private int n1 = 99;

	public void f1() {
		Person p = new Person() {
			private int n1 = 88;

			public void hi() {
				System.out.println("匿名内部类重写了hi方法 " + n1 +" 外部类n1="+ Outer05.this.n1);
			}
		};
		p.hi();
		new Person() {
			public void hi() {
				System.out.println("匿名内部类重写了hi方法,hihi");
			}

			public void ok(String str) {
				super.ok(str);
			}
		}.ok("jack");
	}
}

class Person {
	public void hi() {
		System.out.println("person hi()");
	}

	public void ok(String str) {
		System.out.println("person ok() " + str);
	}
}