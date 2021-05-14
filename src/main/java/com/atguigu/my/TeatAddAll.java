package com.atguigu.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeatAddAll {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
		
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(strList);
		System.out.println(list1);
		
		List list2 = new ArrayList();
		list2.add(1);
		list2.addAll(strList);
		
		String s = list2.toString();
		System.out.println(list2);
		
		
		System.out.println("----------");
		list2.forEach(System.out::println);
	}

}
