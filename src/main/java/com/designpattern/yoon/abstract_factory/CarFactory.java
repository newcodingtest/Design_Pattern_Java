package com.designpattern.yoon.abstract_factory;

public interface CarFactory {

	default Car orderCar(String name, String email) {
		//검증
		validate(name, email);
		//준비
		prepareFor(name);
		//만들기
		Car car = createCar();
		//알림
		sendEmailTo(email, car);
		return car;
	}

	Car createCar();

	void sendEmailTo(String email, Car car);

	private void validate(String name, String email) {
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("차의 이름을 지어주세요");
		}
		if(email == null || email.isBlank()) {
			throw new IllegalArgumentException("이메일을 지어주세요");
		}
		
	}

	private void prepareFor(String name) {
		System.out.println(name + " 만들 준비중 ");
	}
}
