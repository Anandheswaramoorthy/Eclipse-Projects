package com.Serializeble;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Anandh", 20, 95);

        try {
            FileOutputStream fos =
                    new FileOutputStream("student.ser");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}