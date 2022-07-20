package com.designpattern.yoon.abstract_factory;

/**
 * 추상 팩토리
 * */
public interface CarPartsFactory {

	Wheel createWheel(); 
		
	Tire createTire();
}
