/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymain;

import java.util.Date;

/**
 *
 * @author Hamza
 */
public class Book {
    String Name;
    String Author;
    int ID;
    int edition;
    int Price;
    int availableCopies;
    java.util.Date issueDate;
    java.util.Date returnDate;

    public Book(String Name, String Author, int ID, int edition, int Price, int availableCopies, Date issueDate, Date returnDate) {
        this.Name = Name;
        this.Author = Author;
        this.ID = ID;
        this.edition = edition;
        this.Price = Price;
        this.availableCopies = availableCopies;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
    
    
}
