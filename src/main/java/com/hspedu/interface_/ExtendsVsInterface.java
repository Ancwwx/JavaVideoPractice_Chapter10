package com.hspedu.interface_;

public class ExtendsVsInterface {
	public static void main(String[] args) {
		LittleMonkey littleMonkey = new LittleMonkey("悟空");
		littleMonkey.climbing();
		littleMonkey.swimming();
		littleMonkey.flying();

	}
}

class Monkey {
	private String name;

	public Monkey(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void climbing() {
		System.out.println(name + " 会爬树");
	}
}
interface Fishable{
	void swimming();
}
interface Biredable{
	void flying();
}

class LittleMonkey extends Monkey implements Fishable,Biredable{
	

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" 通过学习，可以像鱼儿一样游泳");
	}
	

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" 通过学习，可以像鸟儿一样飞翔");
	}


	public LittleMonkey(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}