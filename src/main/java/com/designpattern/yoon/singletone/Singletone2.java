package com.designpattern.yoon.singletone;

/**
 * 방법2. synchronized 키워드 사용 쓰레드 안전하게 하기
 * */
public class Singletone2 {

	private static Singletone2 instance;
	
	private Singletone2() {}
	
	public static synchronized Singletone2 getInstance() {
		if(instance == null) {
			return new Singletone2();
		}
		return instance;
	}
}

