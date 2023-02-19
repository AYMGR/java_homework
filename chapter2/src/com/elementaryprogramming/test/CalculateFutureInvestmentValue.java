package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.21 (Financial application: calculate future investment value) Write a program that reads in investment amount,
 *  annual interest rate, and number of years and displays the future investment value using the following formula:
 *                    futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
 * Here is a sample run:
 * Enter investment amount: 1000.56
 * Enter annual interest rate in percentage: 4.25
 * Enter number of years: 1
 * Future value is $1043.92
 */
public class CalculateFutureInvestmentValue {

  public static void main(String[] args) {
    // step1: Create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompt user to enter investment amount, annual interest rate, and number of years
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    System.out.print("Enter annual interest rate in percentage: ");
    double annualInterestRate = input.nextDouble();
    System.out.print("Enter number of years: ");
    double numberOfYears = input.nextDouble();

    // step3: Calculate the future investment value
    // compute the monthlyInterestRate
    double monthlyInterestRate = annualInterestRate / 1200.0;
    // calculate the futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears * 12
    double a = Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
    double futureInvestmentValue = investmentAmount * a;

    // step4: Display the future investment value
    System.out.println("The future investment value is: " + futureInvestmentValue);

  }

}
