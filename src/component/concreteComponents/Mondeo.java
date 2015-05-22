package component.concreteComponents;

import component.CarType;

public class Mondeo extends CarType {

	public Mondeo() {
		description = "Mondeo";
	}

	@Override
	public int cost() {

		return 320000;
	}

}
