package com.designpattern.yoon.abstract_factory;

import lombok.Data;

@Data
public class Car {
	private String name;
	private String color;
	private Wheel wheel;
	private Tire tire;
}
