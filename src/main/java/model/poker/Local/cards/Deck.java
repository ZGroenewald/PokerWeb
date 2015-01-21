package model.poker.Local.cards;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zen on 2015/01/09.
 */
public class Deck {
    List<Card> cardDeck;

    public Deck(){
        cardDeck = new LinkedList<>();
        Random randomiser = new Random();
        Card temp;
        for(Suit s: Suit.values()){
            for(Rank r: Rank.values()){
                cardDeck.add(new Card(s, r));
            }
        }

        int size;
        int ind1, ind2;
        for(int i = 0; i < 100; i++){
            ind1 = randomiser.nextInt(cardDeck.size()-1);
            ind2 = randomiser.nextInt(cardDeck.size()-1);
            temp = cardDeck.get(ind2);
            cardDeck.set(ind2, cardDeck.get(ind1));
            cardDeck.set(ind1, temp);
        }
    }

    public Card draw(){
        return cardDeck.remove(0);
    }

    public void shuffle(){
        int newIndex;
        Card temp = new Card();
        Random randIndex = new Random();
        for(int i = 0; i < cardDeck.size(); i++){
            newIndex = randIndex.nextInt(cardDeck.size());
            temp.suit = cardDeck.get(i).suit;
            temp.rank = cardDeck.get(i).rank;
            cardDeck.get(i).suit = cardDeck.get(newIndex).suit;
            cardDeck.get(i).rank = cardDeck.get(newIndex).rank;
            cardDeck.get(newIndex).rank = temp.rank;
            cardDeck.get(newIndex).suit = temp.suit;
        }
    }
}
