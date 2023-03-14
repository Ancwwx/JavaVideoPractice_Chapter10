package com.hspdu.abstract_;

public class AbstractExercise01 {
	public static void main(String[] args) {
		Manager manager = new Manager("jack", "00001", 10000);
		CommonEmployee commonEmployee = new CommonEmployee("mary", "00002", 20000);
		manager.setBonus(8000);
		manager.work();
		commonEmployee.work();
	}
}
