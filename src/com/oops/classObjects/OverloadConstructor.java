package com.oops.classObjects;
class Student
{
    int id;
    String name;
    int age;

    Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    Student()
    {
        id = 1;
        name = "KodNest";
        age = 20;
    }

    Student(int id)
    {
        this.id = id;
    }

    Student(String name, int age)
    {
        this.name = name;
        this.age = 22;
    }
    
    Student(int id, int age)
    {
        this.id = id;
        this.age = 22;
    }


    void display()
    {
        System.out.println(id + " " + name + " " + age);
    }
}
class OverloadConstructor {
	public static void main(String[] args) {
		
        Student s1 = new Student(101, "Akash", 23);
        s1.display();

        Student s2 = new Student();
        s2.display();

        Student s3 = new Student(102);
        s3.display();

        Student s4 = new Student("Ajay", 19);
        s4.display();
        
        Student s5 = new Student(150, 25);
        s5.display();
    }
  }

