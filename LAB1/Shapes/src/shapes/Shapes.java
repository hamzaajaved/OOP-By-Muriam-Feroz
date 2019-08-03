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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("1-Rectangle\n2-Triangle\n3-Circle");
        System.out.println("Enter Choice");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("RECTANGLE CLASS");
            Rectangle r1 = new Rectangle();
            System.out.println("Enter length: ");
            r1.length = sc.nextDouble();
            System.out.println("Enter Breadth: ");
            r1.breadth = sc.nextDouble();
            
            double area = r1.calcArea();
            
            System.out.println("Area of Rectangle is : " + area);
        } else if (choice == 2) {
            System.out.println("TRIANGLE CLASS");
            
            Triangle t1 = new Triangle();
            System.out.println("Enter length L1: ");
            t1.length1 = sc.nextDouble();
            System.out.println("Enter length L2: ");
            t1.length2 = sc.nextDouble();
            System.out.println("Enter length L3: ");
            t1.length3 = sc.nextDouble();
            
            double triArea = t1.getArea();
            System.out.println("AREA OF TRIANGLE IS : " + triArea);
            
        } else if (choice == 3) {
            System.out.println("CIRCLE CLASS");
        }
        
    }

}
