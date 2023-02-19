package com.elementaryprogramming.test;

/**
 *  **2.13 (Financial application: compound value) Suppose you save $100 each month into a savings account with an annual interest rate of 5%.
 *  Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 *          100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 *          (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 *          (100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
 * (In Programming Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)
 * Enter the monthly saving amount: 100
 * After the sixth month, the account value is $608.81
 */
import java.util.*;
public class CompoundValue {

  public static void main(String[] args) {
    // step1: Create a Scanner Object
    Scanner input = new Scanner(System.in);

    // step2: Prompts the user to enter a monthly saving amount
    System.out.print("Enter the monthly saving amount: ");
    double monthlySavingAmount = input.nextDouble();

    // step3: Compute the account value
    double annualInterestRate = 5.0 / 100;
    double monthlyInterestRate = annualInterestRate / 12;
    double monthlyGrowthRate = (1 + monthlyInterestRate);

    // After the first month, the value in the account becomes
    double firstMonthAccountValue = monthlySavingAmount * monthlyGrowthRate;
    // After the second month, the value in the account becomes
    double secondMonthAccountValue = (monthlySavingAmount + firstMonthAccountValue) * monthlyGrowthRate;

    // After the third month, the value in the account becomes
    double thirdMonthAccountValue = (monthlySavingAmount + secondMonthAccountValue) * monthlyGrowthRate;

    // After the fourth month, the value in the account becomes
    double fourthMonthAccountValue = (monthlySavingAmount + thirdMonthAccountValue) * monthlyGrowthRate;

    // After the fifth month, the value in the account becomes
    double fifthMonthAccountValue = (monthlySavingAmount + fourthMonthAccountValue) * monthlyGrowthRate;

    // After the sixth month, the value in the account becomes
    double sixthMonthAccountValue = (monthlySavingAmount + fifthMonthAccountValue) * monthlyGrowthRate;

    // step4: Display the account value after the sixth month
    System.out.println("After the sixth month, the account value is: " + sixthMonthAccountValue);

  }

}
