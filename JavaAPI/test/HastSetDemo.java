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
		set.add("2nd"); // �ظ���Ԫ��û�б�����
		System.out.println(set); // Ԫ�ص�˳��������˳��û�й�ϵ
	}

}
