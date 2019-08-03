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
public class Rectangle {
    double length;
    double breadth;

    double calcArea() {
        return length * breadth;
    }

    double calcPerimeter() {
        return 2 * length + 2 * breadth;
    }

}
