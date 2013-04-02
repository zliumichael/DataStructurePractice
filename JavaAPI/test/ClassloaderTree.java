package test;

import Factory.product.Apple;

public class ClassloaderTree {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("Factory.product.Apple");
		clazz.newInstance();
		Apple ap = new Apple();
		ap.setKind("a");
		System.out.println(ap);
		/*ClassLoader loader = ClassloaderTree.class.getClassLoader(); 
        while (loader != null) { 
            System.out.println(loader.toString()); 
            loader = loader.getParent(); 
        } */
	}
}
