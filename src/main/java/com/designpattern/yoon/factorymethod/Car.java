package com.designpattern.yoon.factorymethod;

import com.designpattern.yoon.abstract_factory.Tire;
import com.designpattern.yoon.abstract_factory.Wheel;

import lombok.Data;

@Data
public class Car {
	private String name;
	private String color;
	private Wheel wheel;
	private Tire tire;
}
