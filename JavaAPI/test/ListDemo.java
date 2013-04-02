package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
        //List list = new ArrayList();
        List<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");            // �����ظ�
        list.add("D");
        list.remove("D");     // ɾ��Ԫ��
        System.out.println(list);   // Ԫ�ص�˳��������˳���й�

        Iterator iter = list.iterator();
        
        for(String st:list){
        	System.out.println(st);
        }
        
        while(iter.hasNext()){
        	list.remove(2);
        	System.out.println(iter.next());
        }
	}
}
