package edu.alex.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Android2017 on 21/02/2017.
 */
public class Deck {
    //properties:
    ArrayList<Card> cards = new ArrayList<>();

    //Constructor:
    public Deck(){
        String[] suits = {"♥" ,"♦", "♣", "♠"};

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                          "10", "Jack", "Queen", "King" ,"Ace"};

        //foreach: iter
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        shuffle();
    }

    public void shuffle(){
        ArrayList<Card> temp = new ArrayList<>();
        Random r = new Random();

        while (cards.size() > 0){
            temp.add(cards.remove(r.nextInt(cards.size())));
        }
        cards = temp;
    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    //Card dealCard() // removes the card from the list
    public Card draw(){
       return cards.remove(0);
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }
}
