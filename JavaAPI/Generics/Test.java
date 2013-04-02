package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(23);
		list.add(4);
		list.add(5);
		list.add(45);
		list.add(54);
		list.add(66);
		list.add(44);
		System.out.println(getOddNumberCount(list));
	}
	
	public static <T> void exchangeElement(int index1, int index2, List<T> list) {
        T temp;
        temp = list.get(index1);
        list.add(index1, list.get(index2));
        list.add(index2,temp);
    }
	
	public static <T extends Integer> int getOddNumberCount(List<T> list){
		int count = 0;
		for(T t:list){
			if(t%2==0){
				++count;
			}
		}
		return count;
		
	}
}
