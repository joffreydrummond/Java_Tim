package com.jed.digitsum;

public class Main {

  public static void main(String[] args) {
    System.out.println("Sum of the digits is = " + digitSum(125));
  }

  public static int digitSum(int num) {
    if (num < 10) {
      return -1;
    }
    int sum = 0;
    while (num > 0){
//extract least significant digit
      int digit = num % 10;
        sum += digit;

        //drop least significant digits
      num /= 10; //same as num = num / 10;
    }
    return sum;
  }
}
