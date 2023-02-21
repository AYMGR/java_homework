package com.selections.test;

import java.util.Scanner;

/**
 * 3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin
 * results in heads or tails. The program randomly generates an integer 0 or 1, which represents
 * head or tail. The program prompts the user to enter a guess, and reports whether the guess is
 * correct or incorrect.
 */
public class HeadsOrTails {

  public static void main(String[] args) {
    // randomly generates an integer 0 or 1
    int headOrTail = (int) (Math.random() * 2);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a guess 0, 1
    System.out.print("Enter 0 or 1 (which represents head or tail): ");
    int guess = input.nextInt();

    // Display whether the guess is correct or incorrect.
    int head = 0, tail = 1;
      if (headOrTail == guess) {
          System.out.println("guess is correct " + "it is "+  ((headOrTail == 0) ? head : tail));
        } else {
          System.out.println("guess is incorrect " + "it is "+ ((headOrTail == 0) ? head : tail));
    }
  }
}
