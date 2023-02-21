package com.selections.test;

import java.util.Scanner;

/**
 * 3.2 (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates two
 * integers and prompts the user to enter the sum of these two integers. Revise the program to
 * generate three single-digit integers and prompt the user to enter the sum of these three
 * integers.
 */
public class AddThreeNumbers {

  public static void main(String[] args) {
    // generate three single-digit integers
    int number1 = (int) (System.currentTimeMillis() % 1000 / 100);
    int number2 = (int) (System.currentTimeMillis() % 100 / 10);
    int number3 = (int) (System.currentTimeMillis() % 10);

    // create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to enter the sum of these three integers
    System.out.print("What is the sum of " + number1 + " + " + number2 + " + " + number3 + " ? ");

    // receive answer
    int answer = input.nextInt();

    // display result
    if (answer == number1 + number2 + number3) {
      System.out.println(
          number1 + " + " + number2 + " + " + number3 + " = " + answer + " is ture");
    } else {
      System.out.println(
          number1 + " + " + number2 + " + " + number3 + " = " + answer + " is false,"
              + " The true answer is " + (number1 + number2 + number3));
    }
  }

}
