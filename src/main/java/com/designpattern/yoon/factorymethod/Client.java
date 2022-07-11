package com.designpattern.yoon.factorymethod;


public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println();
        client.print(new MorningCarFactory(), "윤주영", "yoon@mail.com");
        client.print(new AventeCarFactory(), "홍길동", "yoon@mail.com");
    }
    
    private void print(CarFactory carFactory, String name, String email) {
        System.out.println(carFactory.orderCar(name, email));
    }
}
