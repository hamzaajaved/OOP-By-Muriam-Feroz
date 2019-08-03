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
public class Teacher extends Person {
    int NoOfCourses;
    String Qualification;
    String Designation;

    Teacher(String Name, String Contact, int age, int NoOfCourses, String Qualification) {
        super(Name, Contact, age);
        System.out.println("In Teacher' 5 Perimeter Constructor");
        this.NoOfCourses = NoOfCourses;
        this.Qualification = Qualification;
        if (Qualification.equals("Masters") || Qualification.equals("Bachelos")) {
            this.Designation = "Lecturer";
        } else if (Qualification.equals("M.Phill")) {
            this.Designation = "Assistant Professor";
        } else if (Qualification.equals("PHD")) {
            this.Designation = "Associate Professor";
        }
    }

    Teacher(String Name, String Contact, int NoOfCourses, String Qualification) {
        super(Name, Contact);
        System.out.println("In Teacher' 4 Perimeter Constructor");
        this.NoOfCourses = NoOfCourses;
        this.Qualification = Qualification;
        if (Qualification.equals("Masters") || Qualification.equals("Bachelos")) {
            this.Designation = "Lecturer";
        } else if (Designation.equals("M.Phill")) {
            this.Designation = "Assistant Professor";
        } else if (Designation.equals("PHD")) {
            this.Designation = "Associate Professor";
        }
    }
}
