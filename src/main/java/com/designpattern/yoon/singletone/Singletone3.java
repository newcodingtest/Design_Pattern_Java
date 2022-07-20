package com.designpattern.yoon.singletone;

/**
 * 방법3. 이른 초기화 기법
 * */
public class Singletone3 {

	private static final Singletone3 INSTANCE = new Singletone3();
	
	private Singletone3() {}
	
	public static Singletone3 getInstance() {
		return INSTANCE;
	}
}
