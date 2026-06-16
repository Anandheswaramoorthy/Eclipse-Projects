package Annotations.java;

import java.util.ArrayList;

public class ParentClass {

    void display() {
        System.out.println("Display of Parent");
    }

    @SuppressWarnings({"unused", "unchecked", "rawtypes"})
    void display1() {
        int a = 10;
        int b = 20;

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
    }

    @Deprecated
    void display2() {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Apple");
        al.add("Mango");
        al.add("Papaya");
    }
}
