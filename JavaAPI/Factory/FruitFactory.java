package Factory;

import Factory.product.Apple;
import Factory.product.Fruit;
import Factory.product.Pear;


public class FruitFactory {
	
	public static Fruit getFruit(String name){
		Fruit fruit = null;
		if(name.equals("apple")){
			fruit = new Apple();
		}
		if(name.equals("pear")){
			fruit = new Pear();
		}
		return fruit;
	}
}
