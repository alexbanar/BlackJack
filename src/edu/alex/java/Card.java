package edu.alex.java;

public class Card {
    //Properties:
    String suit; //♥♦♣♠
    String rank; //2 3 4 5 6 7 8 9 10... Jack Queen King Ace

    //Constructor:
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    int getValue(){
    /*
        if (rank.equals("King") || rank.equals("Jack") || rank.equals("Queen"))
            return 10;
        else if (rank.equals("Ace"))
            return 11;
        else
            return Integer.valueOf(rank);
       }
       */

        switch (rank) {
            case "King":
            case "Jack":
            case "Queen":
                return 10;
            case "Ace":
                return 11;
            default:
                return Integer.valueOf(rank);
        }
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getDetails(){
        return rank + " of " + suit;
    }
    public String toString(){
        return "<" + rank + " of " + suit + ">  ";
    }
}