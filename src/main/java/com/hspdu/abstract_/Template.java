package com.hspdu.abstract_;

public abstract class Template {
	public static void main(String[] args) {
		AA aa =new AA();
		aa.caleTime();
		BB bb =new BB();
		bb.caleTime();
	}
	public abstract void job();

	public void caleTime() {
		long start = System.currentTimeMillis();
		job();
		long end = System.currentTimeMillis();
		System.out.println("耗时: " + (end - start));
	}

}

