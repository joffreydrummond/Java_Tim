package com.jed.evenDigitSum;

public class EvenDigitSum {
  public static void main(String[] args) {
    System.out.println("The even digits added = " + getEvenDigitSum(123456789));
  }

  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }
    // set value for the sum of the even numbers
    int sum = 0;
    // while the number is over 0 iterate through number
    while (number > 0) {
      // if the number is even
      if (number % 2 == 0) {
        sum += number % 10; // remove the last digit and add to the sum
      }
      number /= 10; // discard the last digit and iterate through the loop again
    }
    return sum;
  }
}

/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.


EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.*/
