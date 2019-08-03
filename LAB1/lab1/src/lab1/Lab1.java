/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int input = sc.nextInt();
        int fact = factorial(input);
        System.out.println("Factorial of Number is : " + fact);
    }
    
    private static int factorial(int input){
        int fact = 1;
        for (int i = 1; i <= input; i++) {
            fact = fact * i;
        }
        
        return fact;
    }
}
