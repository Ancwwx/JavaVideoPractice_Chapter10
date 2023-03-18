package com.hspedu.try_;

import java.util.Scanner;

public class TryCatchExercise04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println("请输入一个整数:");
			try {
				num = Integer.parseInt(scanner.next());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("请确认输入的数字是一个整数");

			}

		}
		System.out.println("你输入的值:" + num);

	}

}
