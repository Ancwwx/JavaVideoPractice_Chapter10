package com.hspedu.single_;

public class SingleTon01 {
	public static void main(String[] args) {
		//GirlFriend xh =new GirlFriend("小红");
		//GirlFriend xb=new GirlFriend("小白");
			GirlFriend instance1=GirlFriend.getInstance();
			System.out.println(instance1);
			GirlFriend instance2=GirlFriend.getInstance();
			System.out.println(instance2);
			
	}

}

class GirlFriend {
	private String name;
	private static GirlFriend gf = new GirlFriend("小红红");

	private GirlFriend(String name) {
		this.name = name;
	}

	public static GirlFriend getInstance() {
		return gf;
	}

	@Override
	public String toString() {
		return "GirlFriend [name=" + name + "]";
	}

}