package com.designpattern.yoon.abstract_factory;

public class MorningCarFactory extends DefaultCarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new AventeCar();
	}

}
