package Annotations.java;

public class AnnotationApp {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {

        ParentClass d = new ChildClass();

        d.display();
        d.display1();
        d.display2();
    }
}