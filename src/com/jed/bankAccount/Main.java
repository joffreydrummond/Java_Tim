package com.jed.bankAccount;

public class Main {
  public static void main(String[] args) {

    Account fredAccount = new Account(12123, 0.00, "Fred Fancy", "ded@gmail.com", "56577474");

    Account bob = new Account();
    VipCustomer prince = new VipCustomer();
    VipCustomer princess = new VipCustomer("Princess Jasmine", 1000000);
    VipCustomer king = new VipCustomer("King Jafee", 4000000, "kingshit@gmail.com");
    Account joffreyAccount = new Account("Joffrey Drummond", "gds@gmail.com", "5556665555");
//    System.out.println(fredAccount.getAccountNumber());
//    System.out.println(joffreyAccount.getAccountNumber());
//    System.out.println(joffreyAccount.getCustomerName());
//    System.out.println(joffreyAccount.getEmail());
      System.out.println("#################################################");

    System.out.println(prince.getVipName());
    System.out.println(prince.getVipCreditLimit());
    System.out.println(prince.getVipCustomerEmailAddress());
      System.out.println("#################################################");

      System.out.println(princess.getVipName());
      System.out.println(princess.getVipCreditLimit());
      System.out.println(princess.getVipCustomerEmailAddress());
    System.out.println("#################################################");
      System.out.println(king.getVipName());
      System.out.println(king.getVipCreditLimit());
      System.out.println(king.getVipCustomerEmailAddress());



    fredAccount.deposit(350000);

    fredAccount.withdraw(150000);

    //
  }
}
