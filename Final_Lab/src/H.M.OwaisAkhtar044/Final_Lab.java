/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_lab;

/**
 *
 * @author TUSER
 */
public class Final_Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue queue = new Queue(5);
        String[] QUEUE = queue.getQueue();
        for (String QUEUE1 : QUEUE) {
            System.out.println("" + QUEUE1);
        }

        try {
            queue.add("OV");

        } catch (Exception e) {
            e.printStackTrace();
        }

        
        System.out.println("\n\n\n");
        for (String QUEUE1 : QUEUE) {
            System.out.println("" + QUEUE1);
        }

    }

}
