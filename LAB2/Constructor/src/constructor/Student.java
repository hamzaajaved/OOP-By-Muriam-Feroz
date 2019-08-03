/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Hamza
 */
public class Student {
    int id;
    int year;
    String name;

    public Student() {
        this(10, "Zawar");
        System.out.println("Default Constructor");
    }

    public Student(int id, String name) {
//        System.out.println(this);
        System.out.println("Parameterized");
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int year) {
        this(id, name);
        this.year = year;
    }

    void display() {
        if (this.year != 0) {
            System.out.println("Id is " + id + " Name : " + name + " Year: " + year);
        } else {
            System.out.println("Id is " + id + " Name : " + name);
        }
    }
}
