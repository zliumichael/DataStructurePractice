package test.classloader;

import java.lang.reflect.Method;

import test.ClassloaderTree;

public class TestClassloader {

	public static void main(String[] args) {
		new TestClassloader().testClassIdentity();
	}
	
	public void testClassIdentity(){
		String classDataRootPath = "E:\\workspaces\\peoplesoft-adapter\\JavaAPI"; 
	    FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath); 
	    FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
	    String className = "test.Sample"; 	
	    try { 
	    	 Class<?> class1 = fscl1.loadClass(className); 
	         Object obj1 = class1.newInstance(); 
	         Class<?> class2 = fscl2.loadClass(className); 
	         Object obj2 = class2.newInstance(); 
	         Method setSampleMethod = class1.getMethod("setSample", java.lang.Object.class); 
	         setSampleMethod.invoke(obj1, obj2); 
	    } catch (Exception e) { 
	        e.printStackTrace(); 
	    } 
	}
}
