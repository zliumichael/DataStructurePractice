package test;

public class Father {
	public static int fatherinstanceCount=0;
	public Father() {
		System.out.println("father");
		fatherinstanceCount++;
		System.out.println("fatherinstanceCount:"+fatherinstanceCount);
	}

}
