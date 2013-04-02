package Factory;

import Factory.product.Fruit;
import Factory.product.Pear;

public class PearFactory extends FruitAbstractFactory {

	@Override
	public Fruit createFruit() {
		return new Pear();
	}

}
