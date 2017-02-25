package edu.alex.java;

import java.util.ArrayList;

/**
 * Created by Android2017 on 21/02/2017.
 */
public class Hand {
    //Properties:
    //ArrayList<Card> cards
    ArrayList<Card> cards = new ArrayList<>();

    //Methods:
    //1)
    public void addCard(Card c){
        cards.add(c);
    }


    //2)
    //int getValue() -> returns the value of the hand...
    //first count the whole hand, count the aces

    //while(we have aces, and busted)
    //subtract 10 for aces (and aceCount--)
    public int getValue(){
        int value = 0;
        int aceCount = 0;

        for (Card card : cards) {
            value += card.getValue();
            if (card.getValue() == 11)
                aceCount++;
        }

        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }
        return value;
    }


    //3)
    //ArrayList<Card> getCards()
    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getCardsNum()
    {
        return cards.size();
    }
}