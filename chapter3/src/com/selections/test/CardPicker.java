package com.selections.test;


/**
 * **3.24 (Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards.
 * Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and
 * suit (Clubs, Diamonds, Hearts, Spades) of the card. Here is a sample run of the program: The card
 * you picked is Jack of Hearts
 */
public class CardPicker {

  public static void main(String[] args) {

    // Generate random number between 1 and 52
    int num = (int) (Math.random() * 52) + 1;
    int cardNumber = num; // Change this number to simulate picking a different card

    // Determine the card rank
    int rank = (cardNumber - 1) % 13 + 1;
    String rankString;
    switch (rank) {
      case 1:
        rankString = "Ace";
        break;
      case 2:
        rankString = "2";
        break;
      case 3:
        rankString = "3";
        break;
      case 4:
        rankString = "4";
        break;
      case 5:
        rankString = "5";
        break;
      case 6:
        rankString = "6";
        break;
      case 7:
        rankString = "7";
        break;
      case 8:
        rankString = "8";
        break;
      case 9:
        rankString = "9";
        break;
      case 10:
        rankString = "10";
        break;
      case 11:
        rankString = "Jack";
        break;
      case 12:
        rankString = "Queen";
        break;
      case 13:
        rankString = "King";
        break;
      default:
        rankString = "Invalid rank";
        break;
    }

    // Determine the card suit
    int suit = (cardNumber - 1) / 13;
    String suitString;
    switch (suit) {
      case 0:
        suitString = "Clubs";
        break;
      case 1:
        suitString = "Diamonds";
        break;
      case 2:
        suitString = "Hearts";
        break;
      case 3:
        suitString = "Spades";
        break;
      default:
        suitString = "Invalid suit";
        break;
    }

    // Display the card rank and suit
    System.out.println("The card you picked is " + rankString + " of " + suitString + ".");
  }
}



