/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Hamza
 */
public class Librarian {
    public int getDate(Date inputString1, String inputString2) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        //String inputString1 = "23-01-1997";
        //String inputString2 = "27-04-1997";

        long diff = 0;
        int days = 0;
        try {   
            Date date1 = inputString1;
            Date date2 = myFormat.parse(inputString2);
            diff = (date2.getTime() - date1.getTime());
            days = (int) (diff / (24 * 60 * 60 * 1000));
//            days = (int) (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }

    public double getTotalFine(int days, int price) {
        double fine = 0;
        int weeks = days / 7;
        if (days >= 7) {
            fine = 0.1 * price * weeks;
        }
        return fine;
    }

    public boolean memberShipStatus(double fine, int days) {
        boolean memberShip = true;
        if (fine >= 1000 && days >= 30) {
            memberShip = false;
            System.out.println("MemberShip Cancelled");
        } else if (fine >= 1000) {
            memberShip = false;
            System.out.println("MemberShip Suspended");
        }

        return memberShip;
    }
}
