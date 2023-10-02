package com.codedifferentlly.labs;

import com.codedifferentlly.labs.Enums.CardSuit;
import com.codedifferentlly.labs.Enums.CardValue;
import com.codedifferentlly.labs.cards.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class DeckTest {

    private Deck deck;

    @BeforeEach
    public void setup() {
        deck = new Deck();
    }

    @Test
    public void testDeckSizeAfterInitialization() {

        int size = deck.deal(Deck.MAX_NUMBER_OF_CARDS).size();

        Assertions.assertEquals(Deck.MAX_NUMBER_OF_CARDS, size);
    }

    @Test
    public void testShuffle() {
        Assertions.assertFalse(deck.isShuffled());

        deck.shuffle();

        Assertions.assertTrue(deck.isShuffled());
    }

    @Test
    public void testDeal() {

        ArrayList<Card> dealtCards = deck.deal(5);

        Assertions.assertEquals(5, dealtCards.size());

        Assertions.assertEquals(Deck.MAX_NUMBER_OF_CARDS - 5, deck.deal(Deck.MAX_NUMBER_OF_CARDS).size());
    }

    @Test
    public void testDealMoreThanDeckSize() {

        ArrayList<Card> dealtCards = deck.deal(Deck.MAX_NUMBER_OF_CARDS + 1);

        Assertions.assertEquals(Deck.MAX_NUMBER_OF_CARDS, dealtCards.size());
    }

    @Test
    public void testDealFromEmptyDeck() {
        deck.deal(Deck.MAX_NUMBER_OF_CARDS);

        ArrayList<Card> dealtCards = deck.deal(5);

        Assertions.assertEquals(0, dealtCards.size());
    }
}

