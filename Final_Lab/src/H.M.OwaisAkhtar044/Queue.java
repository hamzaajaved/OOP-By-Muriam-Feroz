/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_lab;

import java.util.*;

/**
 *
 * @author TUSER
 */
public class Queue {

    Scanner scan = new Scanner(System.in);
    private int lengthOfQueue;
    private boolean isEmpty;
    private int elementsAvaiable = 0;
    private String[] queue;//new String[lengthOfQueue];

    public Queue() {
        System.out.println("Please Give size of Queue");
        this.lengthOfQueue = Integer.parseInt(scan.nextLine());
        queue = new String[lengthOfQueue];
        elementReciever();

    }

    public Queue(int length) {
        this.lengthOfQueue = length;
        queue = new String[lengthOfQueue];
        elementReciever();

    }

    public String[] getQueue()
    {
        return this.queue;
    }
    
    
    public void elementReciever() {
        queue[0] = "Owais";
        queue[1] = "Akhtar";
        this.elementsAvaiable = 2;

//         System.out.println("Enter Elemnent is Queue");
//        for (int i = 0; i < lengthOfQueue; i++) 
//        {
//            System.out.print("Enter Elements : ");
//            queue[i] = scan.nextLine();
//              this.elementsAvaiable++;
//            
//        }
    }

    public void add(String element) throws Exception {
//        if(!queue[lengthOfQueue-1].equals("\0") )
//        if(!Arrays.asList(queue).contains(""))
//        {
//            throw new Exception("Overload");
//        }
        if (lengthOfQueue - elementsAvaiable == 0) {
            throw new Exception("OverLoad");
        }
        queue[elementsAvaiable] = element;
        this.elementsAvaiable++;

    }

    public void search(String element) throws Exception {
        if (Arrays.asList(queue).contains(element)) {
            System.out.println("Found !!!");
        }
    }

    public void remove() throws Exception {
        //Checking for Empty Charecter
//        for (String queue1 : queue) 
//        {
////            if(!queue1.equals("\0"))
//            if(!Arrays.asList(queue).contains(""))
//            {
//                this.isEmpty = false;
//            }
//        }

        if (elementsAvaiable == lengthOfQueue) {
            throw new Exception("Empty Queue");
        }

//        if(this.isEmpty)
//        {
//           throw new Exception("Can't Remove from Empty Queue");
//        }
        queue[elementsAvaiable - 1] = "\0";

    }

}
