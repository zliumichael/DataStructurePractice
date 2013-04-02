package test;

public class StringDemo {

	public static void main(String[] args) throws Exception {  
        String test1 = "test1,test2"+"ss";
        StringBuilder sb = new StringBuilder("");
        sb.append(test1).append(sb);
        System.out.println(test1.length());
        System.out.println(test1.indexOf(","));
        //String[] array1 = test1.split(",");
       // printString(array1[0]);
        String [] array = new String[]{"s","s","eee"};
       // printString(array1[1]);
    }  
	
	public static void printString(String param){
		System.out.println(param);
	}
}
