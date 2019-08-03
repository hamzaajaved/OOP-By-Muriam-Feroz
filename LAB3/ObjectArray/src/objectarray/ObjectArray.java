/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectarray;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class ObjectArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int choice;

        Circle[] c = new Circle[10];
        System.out.println("Create Object :\n1 - YES \n2 - NO");
        choice = sc.nextInt();
        int count = 0;
        do {
            if (choice == 1) {
                System.out.println("Enter radius: ");
                double radius = sc.nextDouble();

                c[count++] = new Circle(radius);

                //INPUT CHOICE
                System.out.println();
                System.out.println("Create Object :\n1 - YES \n2 - NO");
                choice = sc.nextInt();
            }
        } while (choice == 1);

        for (int i = 0; i < count; i++) {
            System.out.print("Area of Circle " + (i + 1) + ": ");
            System.out.println(c[i].calcArea());
        }
        System.out.println("NUMBER OF CIRCLE OBJECTS CREATED");
        System.out.println(Circle.numberOfObjects);
    }
}
