package com.introductiontocomputersprogramsandjavatm.test;

/**
 * 1.4 (Print a table) Write a program that displays the following table:
 */
public class PrintTable {

  public static void main(String[] args) {
    System.out.println("a" + "\ta^2" + "\ta^3");
    int[] a = {1, 2, 3, 4};
    int i = a[0];
    System.out.println(i + "\t" + i * i + "\t" + i * i * i);
    int j = a[1];
    System.out.println(j + "\t" + j * j + "\t" + j * j * j);
    int k = a[2];
    System.out.println(k + "\t" + k * k + "\t" + k * k * k);
    int x = a[3];
    System.out.println(x + "\t" + x * x + "\t" + x * x * x);

  }

}
