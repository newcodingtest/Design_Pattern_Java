package com.designpattern.yoon.abstract_factory;

public class AventeCarFactory extends DefaultCarFactory {

	private CarPartsFactory carPartsFactory;
	
	public AventeCarFactory(CarPartsFactory carPartsFactory) {
		this.carPartsFactory = carPartsFactory;
	}
	
	@Override
	public Car createCar() {
		Car car = new Car();
		car.setColor("기본");
		car.setName("기본");
		car.setWheel(carPartsFactory.createWheel());
		car.setTire(carPartsFactory.createTire());
		return car;
	}

}
