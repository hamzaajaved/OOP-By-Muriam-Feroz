/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymain;

import java.util.Scanner;

/**
 *
 * @author TUSER
 */
public class UniversityMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter University Name");
        String Name = sc.next();
        
        System.out.println("Enter Address of University: ");
        String Address = sc.next();
        
        System.out.println("Enter Rating: (1 - 5) : ");
        double rating = sc.nextDouble();
        
        System.out.println("Enter Total Faculties in University : ");
        int totalFaculties = sc.nextInt();
        
        University uni = new University(Name, Address, rating, totalFaculties);
        uni.print();
        System.out.println("##################################################");
        System.out.println("Total No of Students in University : " + uni.getStudentCount());
        System.out.println("Total No of Teachers in University : " + uni.getTeachersCount());
        System.out.println("Total No of Courses in University : " + uni.getCoursesCount());
    }
    
}
