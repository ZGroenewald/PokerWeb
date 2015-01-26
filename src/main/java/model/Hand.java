package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zen on 2015/01/09.
 */
public class Hand {

    //public static final int SIZE = 5;
    //public string cardRepresentation = "";
    //@Transient private final List<Card> crds = new List<Card>();
    String hand = "";
    List<Card> cards;
    Deck deck;

    public Hand(){
        deck = new Deck();
        deck.shuffle();
        cards = new LinkedList<Card>();
        for(int i = 0; i < 5; i++){
            cards.add(deck.draw());
        }
    }

    public Hand(String[] ownHand){
        cards = new LinkedList<>();
        List<String> rankList = new ArrayList<>();
        List<String> suitList = new ArrayList<>();
        String tempRank, tempSuit;
        for(int i = 0; i < 5; i++) {
            tempRank = ownHand[i].substring(0,ownHand[i].length()-1);
            //System.out.println(tempRank);
            tempSuit = ownHand[i].substring(ownHand[i].length()-1, ownHand[i].length());
           // Card c = new Card(tempSuit, tempRank);
           // cards.add(new Card(tempSuit, tempRank));
            //System.out.println(tempSuit);
            //rankList.add(tempRank);
            //suitList.add(tempSuit);
        }
    }

    public String toString() {
        for (int i = 0; i < cards.size(); i++) {
            hand += cards.get(i).getThisCardRank() + cards.get(i).getThisCardSuit();
            hand += ", ";
        }
        System.out.println(hand.length());
        return hand;
    }

    public List getCards(){
        return cards;
    }

    public Card getAtIndex(int ind){
        return cards.get(ind);
    }
}
