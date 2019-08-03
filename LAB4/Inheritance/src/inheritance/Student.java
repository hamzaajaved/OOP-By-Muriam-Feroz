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
public class Student extends Person {

    String SeatNo;
    String Class;

    Student(String Name, String Contact, int age, String SeatNo, String Class) {
        super(Name, Contact, age);
        this.SeatNo = SeatNo;
        this.Class = Class;

    }

    Student(String Name, String Contact, String SeatNo, String Class) {
        super(Name, Contact,18);
        this.SeatNo = SeatNo;
        this.Class = Class;

    }

}
