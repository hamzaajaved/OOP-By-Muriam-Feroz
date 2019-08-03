/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Hamza
 */
final public class Circle extends Shape{
    double radius;

    public Circle() {
        super();
    }
    
    public Circle(double radius, String color,Boolean isFilled){
        super(color,isFilled);
        this.radius = radius;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    final public String toString(){
        return "radius = " + this.radius + " " + super.toString();
    }
    
}
