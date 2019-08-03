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
public class Shape {
    
    String color;
    Boolean isFiied;

    public Shape() {
        this.color = "black";
        this.isFiied = false;
    }
    
    public Shape(String color,Boolean isFilled){
        this.color = color;
        this.isFiied = isFilled;
    }
    
    
    public String toString(){
        return "Color = " + this.color + " isFilled = " + this.isFiied;
    }
    
}
