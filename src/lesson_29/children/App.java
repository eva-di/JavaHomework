package lesson_29.children;

import javax.swing.*;
import java.io.PrintStream;

public class App {

    public static void main(String[] args) {
        Parent parent = new Parent("Parent");

        System.out.println(parent.name);

        Child child = new Child();
        System.out.println(child.name);
        System.out.println(child.age);

        System.out.println("================");
        Child child1 = new Child("Child", 100);
        child1.show();


    }


}
