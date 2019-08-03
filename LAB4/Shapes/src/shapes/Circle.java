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
public class Circle extends shape{
    double radius;
    
    public Circle(){
        super();
        this.radius = 5;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle(String color,boolean isFilled,double radius){
        super(color,isFilled);
        this.radius = radius;
    }
    
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    
    public Circle(boolean isFilled,double radius){
        super(isFilled);
        this.radius = radius;
    }
    
    public void DrawCircle(){
        System.out.println("Color: " + super.getColor());
        System.out.println("isFille: " + super.getIsFilled());
    }
    
    double getArea(){
        return radius * Math.PI * Math.PI;
    }
}
