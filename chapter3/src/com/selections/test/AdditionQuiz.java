package com.selections.test;

import java.util.Scanner;

/**
 * 3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction
 * question. Revise the program to randomly generate an addition question with two integers less
 * than 100.
 */
public class AdditionQuiz {

  public static void main(String[] args) {
    // 1. Generate two random single-digit integers
    int num1 = (int) (Math.random() * 100);
    int num2 = (int) (Math.random() * 100);

    // 2. Prompt the student to answer "What is number1 + number2?"
    System.out.print("What is " + num1 + " + " + num2 + " ? ");

    // 3. Create a Scanner
    Scanner input = new Scanner(System.in);

    // 4. Receive the answer
    int answer = input.nextInt();

    // 5. Grade the answer and display the result
    if (num1 + num2 == answer) {
      System.out.println("You are correct!");
    } else {
      System.out.println("Your answer is wrong");
      System.out.println("The true answer for " + num1 + " + " + num2 + " is " + (num1 + num2));
    }
  }
}
