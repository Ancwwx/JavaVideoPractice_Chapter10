package com.hspedu.try_;

public class TryCatchDetail02 {
	public static void main(String[] args) {
		try {
			Person p = new Person();
			p = null;
			System.out.println(p.getName());
			int n1 = 10;
			int n2 = 0;
			int res = n1 / n2;
		} catch (NullPointerException e) {
			System.out.println("空指针异常=" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("算数异常=" + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {

		}

	}

}

class Person {
	private String name = "jack";

	public String getName() {
		return name;
	}
}