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
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s = new Circle(5.9, "Yellow", true);
        if (s instanceof Circle) {
            Circle c = (Circle)s;
            System.out.println(c.toString());
        }
        
        
    }
    
}
