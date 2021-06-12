package com.jed.bankAccount;

public class Main {
  public static void main(String[] args) {

    BankAccount chase = new BankAccount();

    chase.setCustomerName("Melrose Moneybags");
    chase.setAccountNumber(343545);
    chase.setEmail("m.moneybags@gmail.com");
    chase.setPhoneNumber("6235557876");

    chase.deposit(35000);

  chase.withdraw(1500);


    //
  }
}
