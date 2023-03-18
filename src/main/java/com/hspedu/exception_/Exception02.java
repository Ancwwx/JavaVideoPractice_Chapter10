package com.hspedu.exception_;

import java.io.FileInputStream;

public class Exception02 {
	public static void main(String[] args) {
		try {
			FileInputStream fis;
			fis = new FileInputStream("d:\\aa.jpg");
			int len;
			while ((len = fis.read()) != -1) {
				System.out.println(len);
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
