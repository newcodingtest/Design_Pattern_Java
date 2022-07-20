package com.designpattern.yoon.abstract_factory;

public class AventePartsProFactory implements CarPartsFactory{

	@Override
	public Wheel createWheel() {
		return new AventeWheelPro();
	}

	@Override
	public Tire createTire() {
		return new AventeTirePro();
	}

}
