/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringarray;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class StringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        String[][] str = new String[row][2];

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.println("Enter Friend name " + (j + 1) + ": ");
                str[i][j] = sc.next();
            }
            System.out.println();
        }

        System.out.println();
        int totalNoOfFriends = 0;
        System.out.println("Input Name: ");
        String Name = sc.next();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j].equals(Name)) {
                    totalNoOfFriends++;
                }
            }
        }

        System.out.println("Total No of Friends of " + Name + " is : " + totalNoOfFriends);
        String[] temp = new String[totalNoOfFriends];
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i][0].equals(Name)) {
                temp[count++] = str[i][1];
            } else if (str[i][1].equals(Name)) {
                temp[count++] = str[i][0];
            }
        }

        System.out.print("Friends of " + Name + " are: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
