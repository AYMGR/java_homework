package com.selections.test;

import java.util.Scanner;

/**
 * *3.8 (Sort three integers) Write a program that prompts the user to enter three integers and
 * display the integers in non-decreasing order.
 */
public class NonDecreasingOrder {

  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter three integers
    System.out.print("Enter three integers: ");

    // receive the three integers
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    // Sort the numbers in non-decreasing order
    if (num1 > num2) {
      // swap num1 and num2
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      int temp = num2;
      num2 = num3;
      num3 = temp;
    }
    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }

    // Display the three integers in non-decreasing order
    System.out.println(
        "The integers in non-decreasing order are: " + num1 + " " + num2 + " " + num3);

  }

}
