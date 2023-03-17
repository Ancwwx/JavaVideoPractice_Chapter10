package com.hspedu.annotation_;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");
		int i;
		System.out.println(list.get(1));
	}
	
	public void f1() {
		@SuppressWarnings({ "rawtypes"})
		List list = new ArrayList();
		
		list.add("jack");
		list.add("tom");
		list.add("mary");
		
		
		@SuppressWarnings({"unused"})
		int i;
		System.out.println(list.get(1));
	}

}
