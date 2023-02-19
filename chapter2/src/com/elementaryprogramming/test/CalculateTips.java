package com.elementaryprogramming.test;

import java.util.Scanner;

/**
 *  *2.5 (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate,
 *  then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate,
 *  the program displays $1.5 as gratuity and $11.5 as total. Here is a sample run:
 *  Enter the subtotal and a gratuity rate: 10 15
 * The gratuity is $1.5 and total is $11.5
 */
public class CalculateTips {

  public static void main(String[] args) {
    // create a Scanner Object
    Scanner input = new Scanner(System.in);

    // Prompt user to enter the subtotal and a gratuity rate
    System.out.print("Enter the subtotal and a gratuity rate: ");
    int subtotal = input.nextInt();
    int gratuityRate = input.nextInt();

    // calculate gratuity and total
    double gratuity = subtotal * (gratuityRate / 100.0);
    double total = subtotal + gratuity;
    System.out.println("The gratuity is " + '$'+ gratuity + "\tand total is " + '$' + total);

  }

}
