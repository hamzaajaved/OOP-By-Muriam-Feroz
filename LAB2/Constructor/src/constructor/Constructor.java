/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Hamza
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std1 = new Student();
        std1.display();
        
        Student std2 = new Student(20, "Hamza");
        std2.display();
        
        Student std3 = new Student(30, "Yasir", 2018);
        std3.display();
    }
    
}
