package com.introductiontocomputersprogramsandjavatm.test;

/**
 * 1.7 (Approximate p) p can be computed using the following formula: PI = 4 * (1 - 1/3 +1/5 - 1/7 +
 * 1/9 - 1/11 + ...) Write a program that display the results of 4 * (1 - 1/3 +1/5 - 1/7 + 1/9 -
 * 1/11) and 4 * (1 - 1/3 +1/5 - 1/7 + 1/9 - 1/11 + 1/13). Use 1.0 instead of 1
 */
public class ApproximatePI {

  public static void main(String[] args) {
    //  1.  display the results of 4 * (1 - 1/3 +1/5 - 1/7 + 1/9 - 1/11)
    double PI1 = (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
    System.out.println("PI = " + 4 * PI1);

    //  2.  display the results of 4 * (1 - 1/3 +1/5 - 1/7 + 1/9 - 1/11 + 1/13).
    double PI2 = PI1 + 1.0 / 13;
    System.out.println("PI = " + 4 * PI2);
  }

}
