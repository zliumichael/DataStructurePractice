package Singleton;

public class MySingleton {

	private MySingleton(){}
	
	private static MySingleton instance = new MySingleton();
	
	public static MySingleton getInstance(){
		return instance;
	}
}
