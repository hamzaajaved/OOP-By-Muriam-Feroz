/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Date;
/**
 *
 * @author Hamza
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance, double annualInterest) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterest;
        this.dateCreated = new java.util.Date();
    }
    
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new java.util.Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        return (this.annualInterestRate / 100.0) / 12.0;
    }

    public void withdraw(int amount) {
        if (this.balance > 0) {
            this.balance -= amount;
        }else{
            this.balance = 0;
        }
    }
    
    public void deposit(int amount){
        this.balance += amount;
    }

}
