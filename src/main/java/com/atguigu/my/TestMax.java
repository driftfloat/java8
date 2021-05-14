package com.atguigu.my;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Test;

import com.atguigu.java8.Employee;
import com.atguigu.java8.Employee.Status;

public class TestMax {
	List<Employee> emps = Arrays.asList(new Employee(102, "李四", 59, 6666.66, Status.BUSY),
			new Employee(101, "张三", 18, 9999.99, Status.FREE), new Employee(103, "王五", 28, 3333.33, Status.VOCATION),
			new Employee(104, "赵六", 8, 7777.77, Status.BUSY), new Employee(104, "赵六", 8, 7777.77, Status.FREE),
			new Employee(104, "赵六", 8, 7777.77, Status.FREE), new Employee(105, "田七", 38, 5555.55, Status.BUSY));

	@Test
	public void testMax() {
		Optional<Double> max = emps.stream().map(Employee::getSalary).collect(Collectors.maxBy(Double::compare));

		System.out.println(max.get());
		System.out.println("-------------");

		Object max2 = emps.stream().map(Employee::getSalary).collect(Collectors.maxBy(Double::compare));
		System.out.println(max2.getClass());

		System.out.println("-------------");
		Optional<Employee> op = emps.stream()
				.collect(Collectors.minBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
		System.out.println(op.get().getSalary());

		System.out.println("-------------");
		Optional<Double> op2 = emps.stream().map(Employee::getSalary).collect(Collectors.minBy(Double::compare));
		System.out.println(op2.get());
	}

	// 多级分组
	@Test
	public void test6() {
		Map<Status, Map<String, List<Employee>>> map = emps.stream()
				.collect(Collectors.groupingBy(Employee::getStatus, Collectors.groupingBy((e) -> {
					if (e.getAge() <= 35)
						return "青年";
					else if (e.getAge() <= 50 )
						return "中年";
					else
						return "老年";
				})));

		System.out.println(map);
	}
}
