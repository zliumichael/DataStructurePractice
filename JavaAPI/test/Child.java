package test;

public class Child extends Father implements childInterface {
	public static int childinstanceCount=0;
	public Child() {
		System.out.println("child");
		childinstanceCount++;
		System.out.println("childcount:"+childinstanceCount);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		childInterface child1 = new Child();
		childInterface child2 = new Child();

	}
	
	/* (non-Javadoc)
	 * @see test.childInterface#test()
	 */
	@Override
	public void test(){
		//doSomthing();
	}

	private void doSomthing(String s) {
		doElse(s);
	}

	
	public  static void doElse(String params) {
		String param = params;
		System.out.println("do something"+param);
	}

}
