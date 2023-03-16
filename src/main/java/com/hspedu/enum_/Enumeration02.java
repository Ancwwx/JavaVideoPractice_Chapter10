package com.hspedu.enum_;

public class Enumeration02 {
	public static void main(String[] args) {
		System.out.println(Season1.SPRING);
	}

}

class Season1 {
	private String name;
	private String desc;
	public final static Season1 SPRING = new Season1("春天", "温暖");
	public final static Season1 WINTER = new Season1("冬天", "寒冷");
	public final static Season1 SUMMER = new Season1("夏天", "炎热");
	public final static Season1 AUTUMN = new Season1("秋天", "凉爽");

	private Season1(String name, String desc) {
		super();
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
