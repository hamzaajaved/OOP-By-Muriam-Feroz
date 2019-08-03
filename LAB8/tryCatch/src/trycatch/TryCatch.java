/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a : ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            System.out.println(Quotient(a,b));
            
        }catch(ArithmeticException e){
            System.out.println("Airthmetic Exception");
        }catch(InputMismatchException e){
            System.out.println("Input Mismatch Error");
        }catch(Exception e){
            System.out.println("InValid Input");
        }
    }
    
    static int Quotient(int a,int b){
        int c;
        c = a / b;
        return c;
    }
    
}
