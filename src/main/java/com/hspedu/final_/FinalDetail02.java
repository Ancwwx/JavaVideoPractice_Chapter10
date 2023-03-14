package com.hspedu.final_;

public class FinalDetail02 {
	public static void main(String[] args) {
		//BBB bbb=new BBB();
		System.out.println(BBB.num);
	}
}

class BBB {
	public final static int num = 10000;
	static {
		System.out.println("BBB 静态代码块被执行");
	}
}