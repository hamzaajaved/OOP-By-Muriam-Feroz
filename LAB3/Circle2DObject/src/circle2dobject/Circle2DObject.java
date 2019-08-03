/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle2dobject;

import java.util.Scanner;
/**
 *
 * @author Hamza
 */
public class Circle2DObject {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total no of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter Total no of Columns: ");
        int col = sc.nextInt();

        Circle[][] circle = new Circle[row][col];

        System.out.println("Create Object?\n1 - YES\n2 - NO");
        int choice = sc.nextInt();
        do {
            if (choice == 1) {
                System.out.println("Enter Row To Create Circle Object: ");
                int rowCircle = sc.nextInt();

                System.out.println("Input Radius: ");
                int radius = sc.nextInt();

                int count;
                for (int i = 0; i < circle.length; i++) {
                    count = 0;
                    for (int j = 0; j < circle[i].length; j++) {
                        if (i == rowCircle) {
                            if (circle[i][count] == null) {
                                circle[i][count] = new Circle(radius);
                                break;
                            } else {
                                count++;
                                if (count == col) {
                                    System.out.println("***ARRAY OUT OF BOUND****");
                                    break;
                                }
                            }
                        }
                    }
                }
                System.out.println("Create Object?\n1 - YES\n2 - NO");
                choice = sc.nextInt();
            }
        } while (choice == 1);
        
        for (int i = 0; i < circle.length; i++) {
            for (int j = 0; j < circle[i].length; j++) {
                if (circle[i][j] != null) {
                    System.out.println("[" + i + "]" + "[" + j + "] - " + circle[i][j].calcArea());
                }
            }
        }
        System.out.println("Number of Objects Created: ");
        System.out.println(Circle.numberOfObjects);
    }
}
