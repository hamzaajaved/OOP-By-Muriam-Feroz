/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Hamza1
 */
public class Triangle extends shape{
    double a;
    double b;
    double c;
    
    public Triangle(){
        super();
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    
    public Triangle(double a,double b, double c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    double calcArea(){
        return this.a * this.b * this.c;
    }
    
}
