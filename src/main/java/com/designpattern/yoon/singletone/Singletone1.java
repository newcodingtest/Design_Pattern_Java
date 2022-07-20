package com.designpattern.yoon.singletone;

/**
 * 방법1. 멀티 스레드에 안전하지 않은 방법
 * */
public class Singletone1 {
	
	private static Singletone1 instance;
	
	private Singletone1() {}
	
	public static Singletone1 getInstance() {
		if(instance == null) {
			return new Singletone1();
		}
		return instance;
	}
}
