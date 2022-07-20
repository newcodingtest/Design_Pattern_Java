package com.designpattern.yoon.factorymethod;

import com.designpattern.yoon.abstract_factory.AventeCarFactory;
import com.designpattern.yoon.abstract_factory.AventePartsProFactory;
import com.designpattern.yoon.abstract_factory.CarFactory;
import com.designpattern.yoon.abstract_factory.Car;

public class Client {
    public static void main(String[] args) {
    	CarFactory carFactory = new AventeCarFactory(new AventePartsProFactory());
    	Car car = carFactory.createCar();
    	
    	System.out.println(car);
    }
    

}
