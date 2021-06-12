package com.jed.bankAccount;

public class VipCustomer {
    private String vipName;
    private double vipCreditLimit;
    private String vipCustomerEmailAddress;


    public VipCustomer(String vipName, double vipCreditLimit, String vipCustomerEmailAddress) {
        this.vipName = vipName;
        this.vipCreditLimit = vipCreditLimit;
        this.vipCustomerEmailAddress = vipCustomerEmailAddress;
        System.out.println("VIP customer constructor called");

    }

    public VipCustomer() {
     this("Vip Customer", 750000.000, "VIP Customer Default Email Address");
    System.out.println("Empty constructor called");
    }

    public VipCustomer(String vipName, double vipCreditLimit) {
        this(vipName, vipCreditLimit, "VIP Customer Default Email Address");
        System.out.println("Two param constructor called");

    }



    public String getVipName() {
        return vipName;
    }

    public double getVipCreditLimit() {
        return vipCreditLimit;
    }

    public String getVipCustomerEmailAddress() {
        return vipCustomerEmailAddress;
    }


}
