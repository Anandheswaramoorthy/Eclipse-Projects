package com.Serializeble;
import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	int id;
    String name;
    int age;
    transient int marks;

    public Student() {
    }

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
               ", name=" + name +
               ", age=" + age +
               ", marks=" + marks + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, id, marks, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;

        return age == other.age &&
               id == other.id &&
               marks == other.marks &&
               Objects.equals(name, other.name);
    }
}