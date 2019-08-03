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
public class Faculty {

    Scanner sc = new Scanner(System.in);
    String Name;
    Department[] dpt;

    public Faculty(String Name, int noOfDpt) {
        dpt = new Department[noOfDpt];
        this.Name = Name;

        for (int i = 0; i < noOfDpt; i++) {
            System.out.println("Enter Department " + (i + 1) + " Name : ");
            String D_Name = sc.next();

            System.out.println("Enter Total Std in Department: " + (i + 1) + " : ");
            int D_Total_std = sc.nextInt();

            System.out.println("Enter Total Teachers in Department: " + (i + 1) + " : ");
            int D_Total_tch = sc.nextInt();

            System.out.println("Enter Total Courses in Department: " + (i + 1) + " : ");
            int D_TotalCourses = sc.nextInt();

            System.out.println("Enter Total Degrees in Department : " + (i + 1) + " : ");
            int D_TotalDegrees = sc.nextInt();

            System.out.println();
            String[] courses = new String[D_TotalCourses];
            for (int j = 0; j < D_TotalCourses; j++) {
                System.out.println("Enter course " + (j + 1) + " #: ");
                String course = sc.next();
                courses[j] = course;
            }

            String[] degrees = new String[D_TotalDegrees];
            for (int k = 0; k < D_TotalDegrees; k++) {
                System.out.println("Enter Degree " + (k + 1) + " #: ");
                degrees[k] = sc.next();
            }

            dpt[i] = new Department(D_Name, D_Total_std, D_Total_tch, D_TotalCourses, D_TotalDegrees, courses, degrees);
        }
    }

}
