/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Account[] acc = new Account[10];

        for (int i = 0; i < acc.length; i++) {
            acc[i] = new Account(i, 100);
        }

        do {
            System.out.println("Enter an id: ");
            int id = sc.nextInt();

            int count = 1;
            for (int i = 0; i < acc.length; i++) {
                if (acc[i].getId() == id) {
                    count = 0;
                }
            }

            int choice;
            if (count == 0) {
                do {
                    System.out.println("Main Menu");
                    System.out.println("1: check balance\n2: withdraw\n3: deposit\n4: exit");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("The Balance is : " + acc[id].getBalance());
                            break;
                        case 2:
                            System.out.print("Enter the Amount to withdraw: ");
                            int amount = sc.nextInt();
                            acc[id].withdraw(amount);
                            break;
                        case 3:
                            System.out.print("Enter the Amount to deposit: ");
                            int deposit = sc.nextInt();
                            acc[id].deposit(deposit);
                            break;
                        default:
                            break;
                    }

                } while (choice != 4);

            } else {
                System.out.println("INCORRECT! Please Enter Valid ID");
            }

        } while (true);

    }

}
