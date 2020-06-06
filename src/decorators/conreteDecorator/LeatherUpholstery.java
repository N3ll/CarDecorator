package decorators.conreteDecorator;

import component.CarType;

import decorators.ExtraEquipment;

public class LeatherUpholstery extends ExtraEquipment {

	protected int number;
	public LeatherUpholstery(CarType car) {
		this.car = car;
	}

	@Override
	public String getDescription() {
		return car.getDescription() + ", Leather Upholstery";
	}

	@Override
	public int cost() {
		return 45000 + car.cost();
	}

}
