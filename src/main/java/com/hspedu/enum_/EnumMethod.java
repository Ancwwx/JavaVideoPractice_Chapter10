package com.hspedu.enum_;

public class EnumMethod {
	public static void main(String[] args) {
		Season3 autumn = Season3.AUTUMN;
		System.out.println(autumn.name());

		System.out.println(autumn.ordinal());// 输出枚举变量的编号，从0开始;

		Season3[] values = Season3.values();// 含有定义的所有枚举对象
		for (Season3 season : values) {
			System.out.println(season);
		}

		Season3 autumn1 = Season3.valueOf("AUTUMN");
		System.out.println("autumn1=" + autumn1);

		System.out.println(Season3.AUTUMN.compareTo(Season3.SUMMER));//比较两个枚举常量，比较的就是编号

	}

}

enum Season3 {
	SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽");

	private String name;
	private String desc;

	private Season3(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}

}
