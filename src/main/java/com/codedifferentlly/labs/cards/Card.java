package com.codedifferentlly.labs.cards;

import com.codedifferentlly.labs.Enums.CardSuit;
import com.codedifferentlly.labs.Enums.CardValue;

public class Card {
    private CardSuit suit;
    private CardValue value;

    public Card() {
        this.suit = CardSuit.HEARTS;
        this.value = CardValue.TWO;
    }

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
