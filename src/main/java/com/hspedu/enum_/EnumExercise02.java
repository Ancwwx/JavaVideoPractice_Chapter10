package com.hspedu.enum_;

public class EnumExercise02 {
	public static void main(String[] args) {
		System.out.println("=========所有星期的信息如下========");
		Week[] weeks = Week.values();
		for (Week week : weeks) {
			System.out.println(week);
		}
	}
}

enum Week {
	MONDAT("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

	public String name;

	private Week(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
