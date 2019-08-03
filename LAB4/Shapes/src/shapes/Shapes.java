/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

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
        
        Circle c1 = new Circle("red", true, 5.9);
        System.out.println("Area of Circle1 is : " + c1.getArea());
        c1.DrawCircle();
        
        System.out.println();
        
        Circle c2 = new Circle();
        System.out.println("Area of Circle2 is : " + c2.getArea());
        c2.DrawCircle();
        
        
        System.out.println();
        
        Circle c3 = new Circle("Yellow",10.5);
        System.out.println("Area of Circle3 is : " + c3.getArea());
        c3.DrawCircle();
        
        
        System.out.println();
        Circle c4 = new Circle(true,10.5);
        System.out.println("Area of Circle4 is : " + c4.getArea());
        c4.DrawCircle();
        
        System.out.println();
        
    }
    
}
