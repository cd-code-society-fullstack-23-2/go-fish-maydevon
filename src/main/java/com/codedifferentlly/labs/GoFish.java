package com.codedifferentlly.labs;

import com.codedifferentlly.labs.Interfaces.Game;
import com.codedifferentlly.labs.players.CardPlayer;
import com.codedifferentlly.labs.players.Player;

public class GoFish extends CardGame {

    public GoFish() {
        deck = new Deck();
        dealer = new CardPlayer("Beyonce");
        player = null;
    }

    @Override
    public boolean play(Player p) {
        player = new CardPlayer(p.getName());
        deck.shuffle();


        player.addCards(deck.deal(7));
        dealer.addCards(deck.deal(deck.MAX_NUMBER_OF_CARDS - 14));

        return true;
    }
}

