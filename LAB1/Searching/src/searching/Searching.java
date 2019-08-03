/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class Searching {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] arr = {67,12,54,12,6,54,98,23};
        
        LinearSearch s1 = new LinearSearch();
        s1.arr = arr;
        System.out.println("Enter the Number to be searched in array: ");
        s1.no = sc.nextInt();
        
        int value =  s1.search();
        if(value > 0){
            System.out.println("Value: " + s1.no + " Found in array. ");
        }else{
            System.out.println("Value Not Found!!");
        }
        
        
    }
}
