package com.oops.classObjects;

public class Main {

	public static void main(String[] args) {
      classemployee e1obj = new classemployee();
      e1obj.id = 101;
      e1obj.name = "Ajay";
      e1obj.salary = 50000;
      
      System.out.println(e1obj.id);
      System.out.println(e1obj.name);
      System.out.println(e1obj.salary);

      e1obj.work();
      e1obj.AttendMeeting();
	}

}
