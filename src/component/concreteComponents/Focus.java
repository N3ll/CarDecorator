package component.concreteComponents;

import component.CarType;

public class Focus extends CarType {
	public Focus(){
	description = "Focus";
}

	@Override
	public int cost() {
		return 150000;
	}

}
