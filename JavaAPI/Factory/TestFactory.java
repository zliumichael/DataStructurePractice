package Factory;

import Factory.product.Apple;
import Factory.product.Pear;

public class TestFactory {

	public static void main(String[] args) {
		//简单工厂
		Apple apple = (Apple)FruitFactory.getFruit("apple");
		apple.setKind("A");
		apple.setColor("red");
		System.out.println(apple);
		Pear pear =  (Pear)FruitFactory.getFruit("pear");
		pear.setOrigin("shanxi");
		System.out.println(pear);
		
		//工厂方法
		FruitAbstractFactory applefactory = new AppleFactory();
		Apple apple1 = (Apple)applefactory.createFruit();
		
		FruitAbstractFactory pearfactory = new PearFactory();
		Pear pear1 = (Pear)pearfactory.createFruit();
		
		
	}
}
