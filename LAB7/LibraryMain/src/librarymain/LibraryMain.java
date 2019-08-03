/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class LibraryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner askInput = new Scanner(System.in);
        Calendar calender = new GregorianCalendar();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Client> members = new ArrayList<>();

        int choice;
        do {
            System.out.println("LIBRARY MANAGEMENT SYSTEM");
            System.out.println("------------------------------");
            System.out.print("Main Menu\n1: Enter Books To Library\n2: Enter Members To Library\n3: Enter a Book To Read \n4: Return A Book \n5: Pay Fine\n6: Display Books\n7: Display Members \n8: exit\nEnter a Choice: ");
            choice = askInput.nextInt();

            if (choice > 0 && choice < 8) {
                switch (choice) {
                    case 1:
                        AddBooksToLibrary(books, askInput);
                        break;
                    case 2:
                        AddMembersToLibrary(members, askInput);
                        break;
                    case 3:
                        EnterBookToRead(books, members, askInput);
                        break;
                    case 4:
                        ReturnBook(books, members, askInput);
                        break;
                    case 5:
                        PayFine(books, members, askInput);
                        break;
                    case 6:
                        displayBooks(books);
                        break;
                    case 7:
                        displayMembers(members);
                        break;
                    default:
                        System.out.println("Please Enter Correct Choice");
                        break;
                }
            }
        } while (choice != 8 && choice > 0 && choice < 8);
    }

    public static void AddBooksToLibrary(ArrayList<Book> books, Scanner sc) {
        int choice = 1;
        System.out.println("****ENTER BOOKS****");
        do {
            if (choice != 2) {
                System.out.print("Book " + (books.size() + 1) + " Name  : ");
                String B_Name = sc.next();

                System.out.print("Author Name : ");
                String B_Author = sc.next();

                // Assign Book ID
                int B_id = books.size() + 1;

                System.out.print("Edition Name : ");
                int B_edition = sc.nextInt();

                System.out.print("Book's Price : ");
                int B_price = sc.nextInt();

                System.out.print("Quantity of Books: ");
                int B_availableCopies = sc.nextInt();
                books.add(new Book(B_Name, B_Author, B_id, B_edition, B_price, B_availableCopies, null, null)); //null //null issueDate returnDate
            }
            System.out.println();
            System.out.print("Enter Another Book: \n1-Yes\n2-No\nEnter a Choice: ");
            choice = sc.nextInt();
        } while (choice != 2);
    }

    public static void AddMembersToLibrary(ArrayList<Client> members, Scanner sc) {
        int choice = 1;
        System.out.println("****ENTER MEMBERS****");
        do {
            if (choice != 2) {
                System.out.print("Member " + (members.size() + 1) + " Name: ");
                String C_Name = sc.next();

                System.out.print("Contact No: ");
                String C_Contact = sc.next();

                //Book Issued
                members.add(new Client(C_Name, C_Contact, 0, 0)); //0 0 fine BooksIssued
            }
            System.out.println();
            System.out.print("Enter Another Member: \n1-Yes\n2-No\nEnter a Choice: ");
            choice = sc.nextInt();
        } while (choice != 2);
    }

    public static void EnterBookToRead(ArrayList<Book> books, ArrayList<Client> members, Scanner sc) {
        System.out.print("Member's Name: ");
        String Name = sc.next();

        System.out.print("Book Title: ");
        String title = sc.next();

        boolean isMember = false;   // Check It is a Member or not
        boolean bookAvailable = false;
        int totalBooksIssued = 0; //Check Total No of Books Issued

        int i, j = 0;
        for (i = 0; i < members.size(); i++) {
            if (Name.toLowerCase().equals(members.get(i).Name.toLowerCase())) {
                isMember = true;
                break;
            }
        }

        // If It is a Member then find Total No of Books Issued
        if (isMember) {
            for (j = 0; j < books.size(); j++) {
                if (title.toLowerCase().equals(books.get(j).Name.toLowerCase()) && books.get(j).availableCopies > 0) {
                    totalBooksIssued = members.get(i).booksIssued;
                    bookAvailable = true;
                    break;
                }
            }
            if (bookAvailable) {
                if (totalBooksIssued < 3 && books.get(j).availableCopies > 0) {
                    System.out.println("----------------------------------------");
                    System.out.println("Book Name: " + books.get(j).Name + " is issued to " + members.get(i).Name + " on: " + new Date());
                    System.out.println("-----------------------------------------");
                    members.get(i).booksIssued++;
                    books.get(j).availableCopies--;
                    books.get(j).issueDate = new Date();
                } else {
                    System.out.println("***YOU CAN ISSUE ONLY 3 BOOKS****");
                }
            } else {
                System.out.println("***THE BOOK IS NOT AVAILABLE");
            }
        } else {
            System.out.println("***YOU ARE NOT A MEMBER!!!****");
        }

    }

    public static void ReturnBook(ArrayList<Book> books, ArrayList<Client> members, Scanner sc) {
        Librarian librarian = new Librarian();
        System.out.print("Member's Name: ");
        String Name = sc.next();

        System.out.print("Book Title: ");
        String title = sc.next();

        System.out.print("Return Date in Format (18-4-2019): ");
        String returnDate = sc.next();

        //Check Valid Member
        boolean isMember = false;   // Check It is a Member or not
        boolean bookAvailable = false;
        for (int i = 0; i < members.size(); i++) {
            if (Name.toLowerCase().equals(members.get(i).Name.toLowerCase())) {
                isMember = true;
                break;
            }
        }

        Date issueDate = null;
        int diff = 0;
        double fine = 0;
        if (isMember) {
            for (int j = 0; j < books.size(); j++) {
                if (title.toLowerCase().equals(books.get(j).Name.toLowerCase())) {
                    bookAvailable = true;
                    break;
                }
            }

            if (bookAvailable) {
                for (int i = 0; i < books.size(); i++) {
                    if (title.toLowerCase().equals(books.get(i).Name.toLowerCase())) {
                        issueDate = books.get(i).issueDate;
                        books.get(i).availableCopies++;

                        diff = librarian.getDate(issueDate, returnDate);
                        fine = librarian.getTotalFine(diff, books.get(i).Price);
                    }
                }

                System.out.println("Book returned in days: " + diff);
                System.out.println("Total fine to Pay: " + fine);

                for (int i = 0; i < members.size(); i++) {
                    if (Name.toLowerCase().equals(members.get(i).Name.toLowerCase())) {
                        members.get(i).booksIssued--;
                        members.get(i).fine = fine;
                        members.get(i).isMember = librarian.memberShipStatus(fine, diff);
                    }
                }
            } else {
                System.out.println("***THE BOOK NOT BELONG TO THIS LIBRARY*****");
            }

        } else {
            System.out.println("***YOU ARE NOT A MEMBER!!!****");
        }

    }

    public static void PayFine(ArrayList<Book> books, ArrayList<Client> members, Scanner sc) {
        System.out.println("Enter Member's Name: ");
        String Name = sc.next();

        int fine = 0;
        boolean isMember = false;   // Check It is a Member or not
        for (int i = 0; i < members.size(); i++) {
            if (Name.toLowerCase().equals(members.get(i).Name.toLowerCase())) {
                isMember = true;
            }
        }

        if (isMember) {
            for (int i = 0; i < members.size(); i++) {
                if (Name.toLowerCase().equals(members.get(i).Name.toLowerCase())) {
                    fine = (int) members.get(i).fine;
                    System.out.println("Fine You have to Pay is : " + members.get(i).fine);
                }
            }

            System.out.println("Enter Fine: ");
            int finePayed = sc.nextInt();
            if (finePayed >= fine) {
                System.out.println("Fine you have payed: " + finePayed);
                for (int i = 0; i < members.size(); i++) {
                    if (Name.toLowerCase().equals(members.get(i).Name.toLowerCase())) {
                        members.get(i).fine = members.get(i).fine - finePayed;
                        members.get(i).isMember = true;
                        System.out.println("******MemberShip Status: ENABLED*****");
                    }
                }
            } else {
                System.out.println("***PLEASE PAY COMPLETE FINE****");
            }
        } else {
            System.out.println("***YOU ARE NOT A MEMBER!!!****");
        }

    }

    public static void displayBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("NO Books to Display");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println();
                System.out.println("Book Name = " + books.get(i).Name);
                System.out.println("Author Name = " + books.get(i).Author);
                System.out.println("ID Name = " + books.get(i).ID);
                System.out.println("Edition Name = " + books.get(i).edition);
                System.out.println("Price Name = " + books.get(i).Price);
                System.out.println("Available Copies = " + books.get(i).availableCopies);
                if (books.get(i).issueDate != null) {
                    System.out.println("Issue Date = " + books.get(i).issueDate);
                }
                System.out.println("***************************************");
                System.out.println();
            }
        }
    }

    public static void displayMembers(ArrayList<Client> members) {
        if (members.isEmpty()) {
            System.out.println("NO Members To Display");
        } else {
            for (int i = 0; i < members.size(); i++) {
                System.out.println();
                System.out.println("Member Name: " + members.get(i).Name);
                System.out.println("Member Contact Name: " + members.get(i).Contact);
                System.out.println("Book Issued To Member: " + members.get(i).booksIssued);
                System.out.println("Total Fine of Member: " + members.get(i).fine);
                System.out.println("***************************************");
                System.out.println();
            }
        }
    }
}
