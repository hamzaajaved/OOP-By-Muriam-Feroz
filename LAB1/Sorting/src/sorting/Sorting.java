/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
/**
 *
 * @author Hamza
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] arr = {67,12,54,12,6,54,98,23};
        int[] arr = {64,25,12,22,11};
        
        Sort s1 = new Sort();
        s1.arr = arr;
        
        // SELECTION SORT
        int[] newArr  = s1.sort();
        System.out.println("The Sorted Array is: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        
    }
    
}
