package com.hspedu.homework_;

public class Homework07 {
	public static void main(String[] args) {
		Car1 car = new Car1(60);
		car.getAir().flow();
		Car1 car1 = new Car1(-1);
		car1.getAir().flow();
	}
}

class Car1 {
	private double temperature;

	public Car1(double temperature) {
		super();
		this.temperature = temperature;
	}

	class Air {
		public void flow() {
			if (temperature > 40) {
				System.out.println("吹冷气");
			} else if (temperature < 0) {
				System.out.println("吹暖气");
			} else {
				System.out.println("关闭空调");
			}
		}
	}

	public Air getAir() {
		return new Air();

	}
}