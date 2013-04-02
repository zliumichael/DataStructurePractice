package Factory;

import Factory.product.Apple;
import Factory.product.Pear;

public class TestFactory {

	public static void main(String[] args) {
		//�򵥹���
		Apple apple = (Apple)FruitFactory.getFruit("apple");
		apple.setKind("A");
		apple.setColor("red");
		System.out.println(apple);
		Pear pear =  (Pear)FruitFactory.getFruit("pear");
		pear.setOrigin("shanxi");
		System.out.println(pear);
		
		//��������
		FruitAbstractFactory applefactory = new AppleFactory();
		Apple apple1 = (Apple)applefactory.createFruit();
		
		FruitAbstractFactory pearfactory = new PearFactory();
		Pear pear1 = (Pear)pearfactory.createFruit();
		
		
	}
}
