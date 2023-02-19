package com.introductiontocomputersprogramsandjavatm.test;

/**
 * *1.13 (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2
 * * 2 system of linear equation provided that ad – bc is not 0: ax+ by= e   x= (ed-bf) / (ad-bc) y=
 * (af-ec) / (ad-bc) cx+ dy= f Write a program that solves the following equation and displays the
 * value for x and y: (Hint: replace the symbols in the formula with numbers to compute x and y .
 * This exercise can be done in Chapter 1 without using materials in later chapters.) 3.4x + 50.2y =
 * 44.5 2.1x + .55y = 5.9
 */
public class AlgebraSolveLinearEquations {

  public static void main(String[] args) {
    // step1: 3.4x + 50.2y = 44.5
    //        2.1x + .55y = 5.9
    // according to the Cramer’s rule
    double a = 3.4;
    double b = 50.2;
    double c = 2.1;
    double d = 0.55;
    double e = 44.5;
    double f = 5.9;
    // step2: get x, y
    double x = (e * d - b * f) / (a * d - b * c);
    double y = (a * f - e * c) / (a * d - b * c);

    // step3: displays the value for x and y
    System.out.println("The value of x is: " + x);
    System.out.println("The value of y is: " + y);

  }

}
