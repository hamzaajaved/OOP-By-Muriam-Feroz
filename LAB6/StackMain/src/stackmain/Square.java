/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmain;

/**
 *
 * @author Hamza
 */
final class Square extends shape{
    double length;
    double breadth;
    
    public Square(){
        super();
        this.length = 0;
        this.breadth = 0;
    }
    
    public Square(double length,double breadth){
        super();
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    double calcArea(){
        return length * breadth;
    }
    
}