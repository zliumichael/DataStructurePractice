package Factory.abstractfactory;

public class BMWCarFactory implements AbstractCarFactory {

	@Override
	public Car createSportsCar() {
		return new BMWSportsCar();
	}

	@Override
	public Car createBusinessCar() {
		return new BMWBusinessCar();
	}

}
