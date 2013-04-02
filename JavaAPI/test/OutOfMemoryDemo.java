package test;

import java.util.LinkedList;
import java.util.List;

public class OutOfMemoryDemo {
	
	public List<Object[]> list = new LinkedList<Object[]>();

	public static void main(String[] args) {
		OutOfMemoryDemo demo = new OutOfMemoryDemo();
		int index = 0;
		while(true){
			System.out.println(index++);
			Object[] o = new Object[10000000];
			demo.list.add(o);
		}
	}
}
