/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmain;

import java.util.Scanner;
/**
 *
 * @author Hamza
 */
public class StackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Stack: ");
        int n = sc.nextInt();

        System.out.println("Enter the type of Stack: ");
        System.out.println("1-Integer\n2-Double\n3-String\n4-Object");
        int type = sc.nextInt();

        Object[] obj = null;
        switch (type) {
            case 1:
                obj = new Integer[n];
                break;
            case 2:
                obj = new Double[n];
                break;
            case 3:
                obj = new String[n];
                break;
            case 4:
                obj = new Object[n];
                break;
            default:
                System.out.println("Wrong Type!!!");
                break;
        }

        Stack stack = new Stack();
        stack.size = n;
        stack.arr = stack.getDataType(obj);

        System.out.println("1-PUSH\n2-POP\n3-DISPLAY\n4-EXIT");
        int choice = sc.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Enter Input: ");
                    if (obj instanceof Integer[]) {
                        int integer = sc.nextInt();
                        stack.push(integer);
                    } else if (obj instanceof Double[]) {
                        double dbl = sc.nextDouble();
                        stack.push(dbl);
                    } else if (obj instanceof String[]) {
                        String str = sc.next();
                        stack.push(str);
                    } else if (obj instanceof Object[]) {
                        shape[] s = new shape[n];
                        for (int i = 0; i < s.length; i++) {
                            System.out.println("Enter Object to Create: \n1-Circle:\n2-Square:\n3-Triangle: ");
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    System.out.println("Enter Circle Radius: ");
                                    double circleRadius = sc.nextDouble();
                                    s[i] = new Circle(circleRadius);
                                    stack.push(s[i]);
                                    break;
                                case 2:
                                    System.out.println("Enter Square length: ");
                                    double sqLength = sc.nextDouble();
                                    System.out.println("Enter Square Breadth");
                                    double sqBreadth = sc.nextDouble();
                                    s[i] = new Square(sqLength, sqBreadth);
                                    stack.push(s[i]);
                                    break;
                                case 3:
                                    System.out.println("Enter side 1: ");
                                    double s1 = sc.nextDouble();
                                    System.out.println("Enter side 2: ");
                                    double s2 = sc.nextDouble();
                                    System.out.println("Enter side 3: ");
                                    double s3 = sc.nextDouble();
                                    s[i] = new Triangle(s1, s2, s3);
                                    stack.push(s[i]);
                                    break;
                                default:
                                    break;
                            }
                        }
                        for (int i = 0; i < s.length; i++) {
                            System.out.println("Area of Shape " + (i + 1) + "  is :" + s[i].calcArea());
                        }
                    }
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                default:
                    System.out.println("Wrong Choice!!!");
                    break;
            }

            System.out.println("1-PUSH\n2-POP\n3-DISPLAY\n4-EXIT");
            choice = sc.nextInt();
        } while (choice != 4);

    }

}
