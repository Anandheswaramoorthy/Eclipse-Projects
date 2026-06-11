package com.Serializeble;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) {

        try {
            FileInputStream fis =
                    new FileInputStream("student.ser");

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            Student s =
                    (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}