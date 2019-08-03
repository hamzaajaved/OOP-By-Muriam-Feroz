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
public class Inheritance {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher t = new Teacher("MF", "000-000-000", 30, 5, "PHD");
        System.out.println("Teacher's Name: " + t.Name);
        System.out.println("Teacher's Phone: " + t.Contact);
        System.out.println("Teacher's age: " + t.age);
        System.out.println("Teacher's NoOfCourses : " + t.NoOfCourses);
        System.out.println("Teacher's Qualificaton: " + t.Qualification);
        System.out.println("Teacher's Designation: " + t.Designation);
        
        System.out.println();
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println();
        
        Teacher t2 = new Teacher("HB", "000-000-000", 10, "Masters");
        System.out.println("Teacher's Name: " + t2.Name);
        System.out.println("Teacher's Phone: " + t2.Contact);
        System.out.println("Teacher's age: " + t2.age);
        System.out.println("Teacher's NoOfCourses : " + t2.NoOfCourses);
        System.out.println("Teacher's Qualificaton: " + t2.Qualification);
        System.out.println("Teacher's Designation: " + t2.Designation);
           
    }  
}
