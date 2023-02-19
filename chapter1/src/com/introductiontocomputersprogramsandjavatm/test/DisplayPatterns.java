package com.introductiontocomputersprogramsandjavatm.test;

/**
 * 1.3 (Display a pattern) Write a program that displays the following pattern:
 */
public class DisplayPatterns {
  public static void main(String[] args) {
    // 1. display "J"
    System.out.println("    " + "J");
    System.out.println("    " + "J");
    System.out.println("J" + "   " + "J");
    System.out.println(" " + "J" + " " + "J" + "");
    System.out.println("\n=============\n");

    // 2. display "A"
    System.out.println("   " + "A" + "   ");
    System.out.println("  " + "A" + " " + "A" + " ");
    System.out.println(" " + "AAAAA" + " ");
    System.out.println("A" + "     " + "A");
    System.out.println("\n=============\n");

    // 3. display "V"
    System.out.println("V" + "     " + "V");
    System.out.println(" " + "V" + "   " + "V" + " ");
    System.out.println("  " + "V" + " " + "V" + "  ");
    System.out.println("   " + "V" + "   ");

  }

}
