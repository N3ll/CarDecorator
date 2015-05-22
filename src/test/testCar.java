package test;

import component.CarType;
import component.concreteComponents.Mondeo;

import decorators.conreteDecorator.LeatherUpholstery;
import decorators.conreteDecorator.MetalPaintwork;

public class testCar {

	public static void main(String[] args) {
		CarType car = new Mondeo();

		car = new LeatherUpholstery(car);

		car = new MetalPaintwork(car);

		System.out.println(car.getDescription() + " - DKK " + car.cost());
	}

}
