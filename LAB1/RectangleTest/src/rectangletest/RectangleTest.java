/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangletest;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        
        // Rectangle 1
        System.out.print("Input length of Rectangle 1: ");
        r1.length = sc.nextDouble();
        System.out.print("Input Breadth of Rectangle 1: ");
        r1.breadth = sc.nextDouble();
        
        double area1 = r1.calcArea();
        double perimeter1 = r1.calcPerimeter();
        System.out.println("Area of Circle of Rectangle1 is : " + area1);
        System.out.println("Perimeter of Circle of Rectangle1 is : " + perimeter1);
        
        System.out.println("**************************************");
        // Rectangle2
        System.out.print("Input length of Rectangle 2: ");
        r2.length = sc.nextDouble();
        System.out.print("Input Breadth of Rectangle 2: ");
        r2.breadth = sc.nextDouble();
        
        double area2 = r2.calcArea();
        double perimeter2 = r2.calcPerimeter();
        System.out.println("Area of Circle of Rectangle2 is : " + area2);
        System.out.println("Perimeter of Circle of Rectangle2 is : " + perimeter2);
        
    }
}
