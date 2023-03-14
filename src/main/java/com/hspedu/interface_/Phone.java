package com.hspedu.interface_;

public class Phone implements UsbInterface {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("手机开始工作");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("手机停止工作");

	}

}
