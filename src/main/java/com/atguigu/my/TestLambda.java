package com.atguigu.my;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.atguigu.java8.Employee;
import com.atguigu.java8.MyPredicate;

public class TestLambda {
	List<Employee> emps = Arrays.asList(new Employee(101, "张三", 18, 9999.99), new Employee(102, "李四", 59, 6666.66),
			new Employee(103, "王五", 28, 3333.33), new Employee(104, "赵六", 8, 7777.77),
			new Employee(105, "田七", 38, 5555.55));

	// 优化方式一：策略设计模式
	public List<Employee> filterEmployee(List<Employee> emps, MyPredicate<Employee> mp) {
		List<Employee> list = new ArrayList<>();

		for (Employee employee : emps) {
			if (mp.test(employee)) {
				list.add(employee);
			}
		}

		return list;
	}

	// 优化方式三：Lambda 表达式
	@Test
	public void test6() {
//		List<Employee> list = filterEmployee(emps, (e) -> e.getAge() <= 35);
		List<Employee> list = filterEmployee(emps, (t) -> t.getAge() <35);
		list.forEach(System.out::println);

		System.out.println("------------------------------------------");

		List<Employee> list2 = filterEmployee(emps, (e) -> e.getSalary() >= 5000);
		list2.forEach(System.out::println);
	}
}
