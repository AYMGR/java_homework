package com.selections.test;

import java.util.Scanner;

/**
 * *3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor– rock–paper
 * game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The
 * program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program
 * prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user
 * or the computer wins, loses, or draws. Here are sample runs: scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rock. You won scissor (0), rock (1), paper (2): 2 The computer
 * is paper. You are paper too. It is a draw
 */
public class ScissorRockPaper {

  public static void main(String[] args) {
    // Randomly generates a number 0, 1, or 2 representing scissor, rock, and paper
    int randomNumber = (int) (Math.random() * 3);

    // Prompts the user to enter a number 0, 1, or 2
    Scanner input = new Scanner(System.in);
    System.out.print("Enter  scissor (0), rock (1), paper (2): ");
    int guess = input.nextInt();

    // Check and display whether the user or the computer wins, loses, or draws
    if (randomNumber == 0) {
      switch (guess) {
        case 0:
          System.out.println("The computer is scissor, You are scissor too. It is a draw");
          break;
        case 1:
          System.out.println("The computer is scissor, You are rock. You win");
          break;
        case 2:
          System.out.println("The computer is scissor, You are paper. You lose");
          break;
        default:
      }
    } else if (randomNumber == 1) {
      switch (guess) {
        case 0:
          System.out.println("The computer is rock, You are scissor. You lose");
          break;
        case 1:
          System.out.println("The computer is rock, You are rock too. It is a draw");
          break;
        case 2:
          System.out.println("The computer is rock. You are paper. You win");
          break;
        default:
      }
    } else if (randomNumber == 2) {
      switch (guess) {
        case 0:
          System.out.println("The computer is paper, You are scissor. You win");
          break;
        case 1:
          System.out.println("The computer is paper, You are rock. You lose");
          break;
        case 2:
          System.out.println("The computer is paper, You are paper. It is a daw");
          break;
        default:
      }
    }
  }
}
