/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Hamza
 */
public class C extends B{
    char c;
    
    @Override
    void temp() {
        System.out.println("Temp in C");
    }
    
    void xyz(){
        super.temp();
    }
}
