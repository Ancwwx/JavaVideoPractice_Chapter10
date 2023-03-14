package com.hspdu.abstract_;

public class BB extends Template {
	public void job() {
		long num = 0;
		for (long i = 1; i <= 800000; i++) {
			num *= i;
		}
	}

}
