package com.atguigu.my;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import com.atguigu.java8.Employee;
import com.atguigu.java8.Employee.Status;

public class TestStream {
	List<Employee> emps = Arrays.asList(new Employee(102, "李四", 59, 6666.66, Status.BUSY),
			new Employee(101, "张三", 18, 9999.99, Status.FREE), new Employee(103, "王五", 28, 3333.33, Status.VOCATION),
			new Employee(104, "赵六", 8, 7777.77, Status.BUSY), new Employee(104, "赵六", 8, 7777.77, Status.FREE),
			new Employee(104, "赵六", 8, 7777.77, Status.FREE), new Employee(105, "田七", 38, 5555.55, Status.BUSY));
	
	@Test
	public void squart() {
//		List<Integer> nl =  Arrays.asList( 2, 3, 4, 5);
		Integer[] nl = {2, 3, 4, 5};
		Arrays.stream(nl)
		  .map((x) -> x * x)
		  .forEach(System.out::println);
	}
	
	@Test
	public void count() {
		Optional<Integer> sum =  emps.stream()
			.map((e) -> 1 )
			.reduce(Integer::sum);
		System.out.println(sum.get());
			
	}
}
