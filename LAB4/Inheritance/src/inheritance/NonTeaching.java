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
public class NonTeaching  extends Person{
    
    String Designation;

    public NonTeaching(String Name, String Contact, int age,String Designation) {
        super(Name,Contact,age);
        this.Designation = Designation;
    }
    
    public NonTeaching(String Name, String Contact,String Designation) {
        super(Name,Contact,20);
        this.Designation = Designation;
    }
    
}
