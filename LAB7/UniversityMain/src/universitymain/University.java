/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymain;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class University {
    
    Scanner sc = new Scanner(System.in);
    
    String Name;
    String Address;
    double Rating;
    Faculty[] faculty;

    public University(String Name, String Address, double Rating, Faculty[] faculty, int facultyCount) {
        this.Name = Name;
        this.Address = Address;
        this.Rating = Rating;
        
        for (int i = 0; i < facultyCount; i++) {
            System.out.println("Enter Faculty  "+ (i + 1) +" Name: ");
            String fName = sc.next();
            
            
            
            faculty[i] = new Faculty(Name, dpt, facultyCount);
        }
    }
    
}
