package test;

import java.util.HashSet;

public class HastSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("1st");
		set.add("2nd");
		set.add("3rd");
		set.add(new String("Four"));
		set.add(new Integer(6));
		set.add("2nd"); // 重复的元素没有被加入
		System.out.println(set); // 元素的顺序与加入的顺序没有关系
	}

}
