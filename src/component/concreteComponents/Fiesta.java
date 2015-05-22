package component.concreteComponents;

import component.CarType;

public class Fiesta extends CarType {
	public Fiesta() {
		description = "Fiesta";
	}

	@Override
	public int cost() {
		return 200000;
	}

}
