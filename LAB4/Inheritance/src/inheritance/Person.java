/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Hamza
 */
public class Person {

    String Name;
    String Contact;
    int age;

    Person(String Name, String Contact, int age) {
        System.out.println("In Person Constructor");
        this.Name = Name;
        this.Contact = Contact;
        this.age = age;
    }

    Person(String Name, String Contact) {
        
        this(Name, Contact, 25);
        System.out.println("In Person Constructor Perimeterized");
    }
}
