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
public class Sort {

    int[] arr;
    
    
    public int[] sort() {
        for (int i = 0; i < arr.length; i++) {
            int lowest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) {
                    lowest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
        }
        
        return arr;
        
    }

}
