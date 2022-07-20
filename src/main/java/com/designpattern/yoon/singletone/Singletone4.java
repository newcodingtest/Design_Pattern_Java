package com.designpattern.yoon.singletone;

/**
 * 방법4. double checked locking 기법
 * */
public class Singletone4 {

	//Java 변수를 Main Memory에 저장하겠다라는 것을 명시하는 것
	//매번 변수의 값을 Read할 때마다 CPU cache에 저장된 값이 아닌 Main Memory에서 읽는 것입니다.
	//또한 변수의 값을 Write할 때마다 Main Memory에 까지 작성하는 것입니다.
	private static volatile Singletone4 instance;
	
	private Singletone4() {}
	
	public static Singletone4 getInstance() {
		if(instance==null) {
			synchronized (Singletone4.class) {
				if(instance == null) {
					instance = new Singletone4();
				}
			}
		}
		return instance;
	}
}
