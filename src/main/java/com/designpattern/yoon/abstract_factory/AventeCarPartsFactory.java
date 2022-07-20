package com.designpattern.yoon.abstract_factory;

/**
 * 구체 클래스
 * */
public class AventeCarPartsFactory implements CarPartsFactory{

	@Override
	public Wheel createWheel() {
		return new AventeWheel();
	}

	@Override
	public Tire createTire() {
		return new AventeTire();
	}
}
