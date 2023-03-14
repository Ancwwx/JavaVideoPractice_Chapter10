package com.hspedu.interface_;

public class MysqlDB implements DBInterface {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("连接mysql");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭mysql");

	}

}
