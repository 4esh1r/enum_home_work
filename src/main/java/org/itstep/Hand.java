package org.itstep;

import org.itstep.blackjack.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void  addCard(Card card){
        cards.add(card);
    }

    public int getValue(){
        int value = 0;
        for(Card card: cards){
            value += card.getValue();
        }
        return value;
    }

    public List<Card> getCards(){
        return cards;
    }

    public void reset() {
        cards.clear();
    }
}
