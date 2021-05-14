package com.atguigu.my;

import java.time.ZoneId;
import java.util.Set;
import java.util.TreeSet;

public class TestZone {

	public static void main(String[] args) {
		Set<String>  zIds= ZoneId.getAvailableZoneIds();
		TreeSet<String> ids = new TreeSet(zIds);
		ids.forEach(System.out::println);
	}

}
