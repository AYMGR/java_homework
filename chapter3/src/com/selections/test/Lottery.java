package com.selections.test;

import java.util.Scanner;

/**
 * **3.15 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit
 * integer. The program prompts the user to enter a three-digit integer and determines whether the
 * user wins according to the following rules: 1. If the user input matches the lottery number in
 * the exact order, the award is $10,000. 2. If all digits in the user input match all digits in the
 * lottery number, the award is $3,000. 3. If one digit in the user input matches a digit in the
 * lottery number, the award is $1,000.
 */
public class Lottery {

  public static void main(String[] args) {
    // Generate a lottery of a three-digit integer
    int lottery = (int) (Math.random() * 1000);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a guess
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();

    // Extracts each digit from the lottery integer using integer division and the modulus operator
    int hundredsDigitOfLottery = lottery / 100;
    int tensDigitOfLottery = lottery % 100 / 10;
    int digitOfLottery = lottery % 10;

    // Extracts each digit from the guess integer using integer division and the modulus operator
    int hundredsDigitOfGuess = guess / 100;
    int tensDigitOfGuess = guess % 100 / 10;
    int digitOfGuess = guess % 10;

    // Check the guess
    System.out.println("The lottery is " + lottery);
    if (lottery == guess) {
      System.out.println("Exact match: you win $10,000");
    } else if (
        (hundredsDigitOfLottery == tensDigitOfGuess || hundredsDigitOfLottery == digitOfGuess) && (
            tensDigitOfLottery == hundredsDigitOfGuess || tensDigitOfLottery == digitOfGuess) && (
            digitOfLottery == hundredsDigitOfGuess || digitOfLottery == tensDigitOfGuess)) {
      System.out.println("Match all digits: you win $3000");
    } else if (hundredsDigitOfLottery == hundredsDigitOfGuess
        || hundredsDigitOfLottery == tensDigitOfGuess || hundredsDigitOfLottery == digitOfGuess
        || tensDigitOfLottery == hundredsDigitOfGuess || tensDigitOfLottery == tensDigitOfGuess
        || tensDigitOfLottery == digitOfGuess || digitOfLottery == hundredsDigitOfGuess
        || digitOfLottery == tensDigitOfGuess || digitOfLottery == digitOfGuess) {
      System.out.println("Match one digit: you win $1000");
    } else {
      System.out.println("Sorry, no match");
    }

  }

}
