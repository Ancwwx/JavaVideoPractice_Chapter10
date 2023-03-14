package com.hspdu.abstract_;

public class AA extends Template {
	public void job() {
		long num = 0;
		for (long i = 1; i <= 500000; i++) {
			num += i;
		}
	}

}
