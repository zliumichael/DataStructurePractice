package Factory;

import Factory.product.Apple;

public class AppleFactory extends FruitAbstractFactory {

	@Override
	public Apple createFruit() {
		
		return new Apple();
	}

}
