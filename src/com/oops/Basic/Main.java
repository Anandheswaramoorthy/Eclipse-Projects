package com.oops.Basic;

public class Main {

	public static void main(String[] args) {

        Car carobj = new Car();

        carobj.color = "White";
        carobj.price = 3000000;
        carobj.brand = "BMW";

        System.out.println("Car color: " + carobj.color);
        System.out.println("Car price: " + carobj.price);
        System.out.println("Car brand: " + carobj.brand);

        carobj.start();
        carobj.accelerate();
        carobj.stop();
	}

}
