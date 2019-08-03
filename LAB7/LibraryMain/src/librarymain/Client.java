/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymain;

/**
 * 
 * @author Hamza
 */
public class Client {
    String Name;
    String Contact;
    int booksIssued;
    double fine;
    boolean isMember;

    public Client(String Name, String Contact, int booksIssued, int fine) {
        this.Name = Name;
        this.Contact = Contact;
        this.booksIssued = booksIssued;
        this.fine = fine;
    }
  
}
