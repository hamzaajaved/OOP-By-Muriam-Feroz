/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape[] s = new shape[3];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter Object to Create: \n1-Circle:\n2-Square:\n3-Triangle: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Circle Radius: ");
                    double circleRadius = sc.nextDouble();
                    s[i] = new Circle(circleRadius);
                    break;
                case 2:
                    System.out.println("Enter Square length: ");
                    double sqLength = sc.nextDouble();
                    double sqBreadth = sc.nextDouble();
                    s[i] = new Square(sqLength, sqBreadth);
                    break;
                case 3:
                    System.out.println("Enter side 1: ");
                    double s1 = sc.nextDouble();
                    double s2 = sc.nextDouble();
                    double s3 = sc.nextDouble();
                    s[i] = new Triangle(s1, s2, s3);
                    break;
                default:
                    break;
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println("Area of Shape "+ (i + 1) + "  is :" + s[i].calcArea());
        }
    }
}
