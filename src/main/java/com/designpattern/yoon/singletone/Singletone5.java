package com.designpattern.yoon.singletone;

/**
 * 방법5. 내부 클래스 기법
 * */
public class Singletone5 {

	private Singletone5() { }

    private static class Settings5Holder {
        private static final Singletone5 INSTANCE = new Singletone5();
    }

    public static Singletone5 getInstance() {
        return Settings5Holder.INSTANCE;
    }
    
}
