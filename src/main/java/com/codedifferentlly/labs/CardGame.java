package com.codedifferentlly.labs;

import com.codedifferentlly.labs.Interfaces.Game;
import com.codedifferentlly.labs.players.CardPlayer;
import com.codedifferentlly.labs.players.Player;

abstract class CardGame implements Game {
    protected Deck deck;
    protected CardPlayer player;
    protected CardPlayer dealer;

    public abstract boolean play(Player player);
}
