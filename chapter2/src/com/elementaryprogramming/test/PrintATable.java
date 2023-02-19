package com.elementaryprogramming.test;

/**
 *  2.18 (Print a table) Write a program that displays the following table. Cast floating-point numbers into integers.
 *    a   b   pow(a, b)
 *    1   2   1
 *    2   3   8
 *    3   4   81
 *    4   5   1024
 *    5   6   15625
 */
public class PrintATable {

  public static void main(String[] args) {
    int a = 0;
    int b = 1;


    System.out.print("a" + "\tb" + "\tpow(a, b)");
    for (int i = 0; i <= 5; i++) {
      System.out.println(a + "\t" + b + "\t" + Math.pow(a, b));
      a++;
      b++;
      }
    }
  }

