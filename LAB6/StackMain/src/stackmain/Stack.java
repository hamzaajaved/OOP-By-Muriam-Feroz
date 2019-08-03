/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmain;

/**
 *
 * @author Hamza
 */
final class Stack {
    int size;
    Object[] arr;
    int top = -1;

    void push(Object x) {
        if (top >= size - 1) {
            System.out.println("*****STACK OVERFLOW*****");
        } else {
            arr[++top] = x;
        }
    }

    void pop() {
        if (top <= -1) {
            System.out.println("*****STACK UNDERFLOW*****");
        } else {
            arr[top--] = null;
        }
    }

    void display() {
        System.out.println("******STACK*******");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public Object[] getDataType(Object obj) {
        
        if (obj instanceof Integer[]) {
            return new Integer[size];
        } else if (obj instanceof Double[]) {
            return new Double[size];
        } else if (obj instanceof String[]) {
            return new String[size];
        } else if (obj instanceof Object[]) {
            return new Object[size];
        }
        
        return new Object[size];
     
    }

}
