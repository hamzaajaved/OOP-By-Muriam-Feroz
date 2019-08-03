/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmain;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class StaticMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(10);
        Circle c4 = new Circle(15);

        System.out.print("Number of Objects Created: ");
        System.out.println(Circle.numberOfObjects);

    }

}
