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
public class University {

    Scanner sc = new Scanner(System.in);
    String Name;
    String Address;
    double rating;
    int noOfFaculties;
    Faculty[] faculty;

    public University(String Name, String Address, double rating, int noOfFaculties) {
        faculty = new Faculty[noOfFaculties];
        this.Name = Name;
        this.Address = Address;
        this.rating = rating;
        this.noOfFaculties = noOfFaculties;

        for (int i = 0; i < noOfFaculties; i++) {
            System.out.println("Enter Faculty " + (i + 1) + " Name: ");
            String f_Name = sc.next();

            System.out.println("Enter No of Department in Faculty " + (i + 1) + " : ");
            int f_TotalDpt = sc.nextInt();

            faculty[i] = new Faculty(f_Name, f_TotalDpt);
        }

    }

    public int getStudentCount() {
        int count = 0;
        for (int i = 0; i < this.faculty.length; i++) {
            for (int j = 0; j < this.faculty[i].dpt.length; j++) {
                count = count + this.faculty[i].dpt[j].stdCount;
            }
        }
        return count;
    }

    public int getTeachersCount() {
        int count = 0;
        for (int i = 0; i < this.faculty.length; i++) {
            for (int j = 0; j < this.faculty[i].dpt.length; j++) {
                count = count + this.faculty[i].dpt[j].teacherCount;
            }
        }
        return count;
    }

    public int getCoursesCount() {
        int count = 0;
        for (int i = 0; i < this.faculty.length; i++) {
            for (int j = 0; j < this.faculty[i].dpt.length; j++) {
                count = count + this.faculty[i].dpt[j].Courses.length;
            }
        }
        return count;
    }

    public void print() {

        System.out.println(
                "*************************************"
                + "\nUniversity Name = " + this.Name
                + "\nUniversity Address = " + this.Address
                + "\nUniversity Rating = " + this.rating
        );

        for (int i = 0; i < this.noOfFaculties; i++) {
            System.out.println();
            System.out.println("Faculty " + (i + 1) + " Name : " + faculty[i].Name);
            for (int j = 0; j < this.faculty[i].dpt.length; j++) {
                System.out.println("Department " + (j + 1) + " Name: " + this.faculty[i].dpt[j].Name);
                System.out.println("Department " + (j + 1) + " Total Student : " + this.faculty[i].dpt[j].stdCount);
                System.out.println("Department " + (j + 1) + " Total Teachers : " + this.faculty[i].dpt[j].teacherCount);
                System.out.print("No of Courses in Department " + (j + 1) + " # ");
                for (int k = 0; k < this.faculty[i].dpt[j].Courses.length; k++) {
                    System.out.print(this.faculty[i].dpt[j].Courses[k] + " ");
                }
                System.out.println();
                System.out.print("No of Degrees in Department " + (j + 1) + " # ");
                for (int l = 0; l < this.faculty[i].dpt[j].Degrees.length; l++) {
                    System.out.print(this.faculty[i].dpt[j].Degrees[l] + " ");
                }
                System.out.println();
            }
        }
    }
}
