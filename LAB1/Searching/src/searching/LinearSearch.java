/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

/**
 *
 * @author Hamza
 */
public class LinearSearch {
    int[] arr;
    int no;
    
    public int search(){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (no == arr[i]) {
                counter++;
            }
        }
        
        return counter;
    }
}
