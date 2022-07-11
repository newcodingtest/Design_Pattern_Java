package com.designpattern.yoon.factorymethod;

public class AventeCarFactory extends DefaultCarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new AventeCar();
	}

}
