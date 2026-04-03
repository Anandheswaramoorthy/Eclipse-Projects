package com.HasArealationship;

//Brain class (Composition)
class Brain {
 String nerves;

 Brain(String nerves) {
     this.nerves = nerves;
 }

 void showBrain() {
     System.out.println("Brain nerves: " + nerves);
 }
}

//Bike class (Aggregation)
class Bike {
 int mileage;

 Bike(int mileage) {
     this.mileage = mileage;
 }

 void showBike() {
     System.out.println("Bike mileage: " + mileage);
 }
}

//Person class
class Person {
 String name;
 int age;

 Brain brain;   // Composition
 Bike bike;     // Aggregation

 Person(String name, int age, Bike bike) {
     this.name = name;
     this.age = age;

     // Composition (created inside)
     this.brain = new Brain("Complex nerves");

     // Aggregation (passed from outside)
     this.bike = bike;
 }

 void showPerson() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);

     brain.showBrain();
     bike.showBike();
 }
}

//Inheritance
class Student extends Person {
 int rollNo;

 Student(String name, int age, int rollNo, Bike bike) {
     super(name, age, bike);
     this.rollNo = rollNo;
 }

 void showStudent() {
     showPerson();
     System.out.println("Roll No: " + rollNo);
 }
}

//Main class

public class AggrecationCompostition {

	public static void main(String[] args) {
	

     Bike myBike = new Bike(50); // Aggregation

     Student s = new Student("Anandh", 21, 101, myBike);

     s.showStudent();
 }
}