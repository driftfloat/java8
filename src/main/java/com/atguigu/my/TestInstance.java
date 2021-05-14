package com.atguigu.my;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class TestInstance {
	public static void main(String[] args) {
		Instant in1 = Instant.now();
		System.out.println(in1);
		
		OffsetDateTime o = in1.atOffset(ZoneOffset.ofHours(8));
		System.out.println(o);
		
		System.out.println(in1.toEpochMilli());
		System.out.println(Long.MAX_VALUE);
	}
}
