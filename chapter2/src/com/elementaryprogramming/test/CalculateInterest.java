package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.20 (Financial application: calculate interest) If you know the balance and the annual percentage interest rate,
 *  you can compute the interest on the next monthly payment using the following formula:
 *              interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate
 * and displays the interest for the next month. Here is a sample run:
 * Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * The interest is 2.91667
 */
public class CalculateInterest {

  public static void main(String[] args) {
    // step1: Create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompt user to enter the balance and the annual percentage interest
    System.out.print("Enter the balance and the annual percentage interest (e.g., 3 for 3%): ");
    double balance = input.nextDouble();
    double annualInterestRate = input.nextDouble();

    // step3: Compute the interest on the next monthly payment
    double interest =  balance * (annualInterestRate / 1200.0);

    // step4: Display the interest for the next month
    System.out.println("The interest is: " + interest);
  }

}
