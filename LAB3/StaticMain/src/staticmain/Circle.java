/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmain;
/**
 *
 * @author Hamza
 */
public class Circle {
    double radius;
    static int numberOfObjects = 0;
    
    Circle(){
        radius = 0;
        numberOfObjects++;
    }

    public Circle(float radius) {
        numberOfObjects++;
        this.radius = radius;
    }
    
    double calcArea(){
        return radius * Math.PI * Math.PI;
    }
}
