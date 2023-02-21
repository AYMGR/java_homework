package com.selections.test;

/**
 * **3.4 (Random month) Write a program that randomly generates an integer between 1 and 12 and
 * displays the English month names January, February, . . . , December for the numbers 1, 2, . . .
 * , 12, accordingly.
 */
public class RandomMonth {

  public static void main(String[] args) {
    // Randomly generates an integer between 1 and 12
    int month = (int) (Math.random() * 12) + 1;

    // displays the English month names January, February, . . . , December for the numbers 1, 2, . . . , 12, accordingly.
    // method1: Switch case statement
    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      default:
    }

    // method2: if else-if else statement
    if (month == 1) {
      System.out.println("January");
    } else if (month == 2) {
      System.out.println("February");
    } else if (month == 3) {
      System.out.println("March");
    } else if (month == 4) {
      System.out.println("April");
    } else if (month == 5) {
      System.out.println("May");
    } else if (month == 6) {
      System.out.println("June");
    } else if (month == 7) {
      System.out.println("July");
    } else if (month == 8) {
      System.out.println("August");
    } else if (month == 9) {
      System.out.println("September");
    } else if (month == 10) {
      System.out.println("October");
    } else if (month == 11) {
      System.out.println("November");
    } else {
      System.out.println("December");
    }
  }
}
