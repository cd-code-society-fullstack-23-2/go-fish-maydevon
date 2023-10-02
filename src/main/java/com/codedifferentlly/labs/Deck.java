package com.codedifferentlly.labs;

import com.codedifferentlly.labs.Enums.CardSuit;
import com.codedifferentlly.labs.Enums.CardValue;
import com.codedifferentlly.labs.cards.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    protected static final int MAX_NUMBER_OF_CARDS = 52;
    private ArrayList<Card> cards;
    private boolean shuffled;

    public Deck() {
        this.cards = new ArrayList<>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardValue value : CardValue.values()) {
                cards.add(new Card(suit, value));
            }
        }
        this.shuffled = false;
    }

    public void shuffle() {
        Collections.shuffle(cards);
        shuffled = true;
    }

    public boolean isShuffled() {
        return shuffled;
    }

    public ArrayList<Card> deal(int numberOfCard) {
        ArrayList<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < numberOfCard && !cards.isEmpty(); i++) {
            dealtCards.add(cards.remove(0));
        }
        return dealtCards;
    }
}
