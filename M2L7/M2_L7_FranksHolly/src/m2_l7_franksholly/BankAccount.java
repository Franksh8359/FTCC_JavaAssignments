/**
* This is Lab 7 (BankAccount Class Copy Constructor) in module 2 for Chapter 8.
* 9-6-2017
* CSC 251 Lab 7 - BankAccount Class Copy Constructor
* @author Holly Franks
*/
package m2_l7_franksholly;

public class BankAccount {
    
    private double balance;
    public BankAccount() {balance = 0.0;}
    
    public BankAccount(BankAccount obj) {balance = obj.balance;}   
    public BankAccount(double startBalance) {balance = startBalance;}
    public BankAccount(String str) {balance = Double.parseDouble(str);}
    
    public void deposit(double amount) {balance += amount;}
    public void deposit(String str) {balance += Double.parseDouble(str);}
    
    public void withdraw(double amount) {balance -= amount;}
    public void withdraw(String str) {balance -= Double.parseDouble(str);}
    
    public double getBalance() {return balance;}
    
}
