package com.designpattern.yoon.abstract_factory;


public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println();
        client.print(new AventeCarFactory(new AventePartsProFactory()), "홍길동", "yoon@mail.com");
    }
    
    private void print(CarFactory carFactory, String name, String email) {
        System.out.println(carFactory.orderCar(name, email));
    }
}
