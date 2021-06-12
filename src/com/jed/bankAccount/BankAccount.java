package com.jed.bankAccount;

public class BankAccount {

  private double accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public double getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(int balance) {

    this.balance = balance;
  }


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void deposit(double depositAmount) {
    this.balance += depositAmount;
    System.out.println("You made a deposit of " + depositAmount + ". The current balance is " + this.balance);
  }

  public void withdraw(double withdrawAmount) {
    if (this.balance - withdrawAmount < 0) {
      System.out.println(
          "Not enough money to make a withdrawal. You only have " + this.balance + "available");
    } else {
      this.balance -= withdrawAmount;
      System.out.println(
          "The withdrawal of "
              + withdrawAmount
              + " has been processed. You now have a balance of "
              + this.balance
              + " remaining in your account.");
    }
  }
}
