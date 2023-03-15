package com.hspedu.interface_;

public class InterfaceExercise02 {
	public static void main(String[] args) {
		new C().pX();
	}

}

interface E {
	int x = 0;
}

class D {
	int x = 1;
}

class C extends D implements E{
	public void pX() {
		System.out.println(E.x +" "+ super.x);
	}
}