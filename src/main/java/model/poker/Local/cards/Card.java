package model.poker.Local.cards;

/**
 * Created by Zen on 2015/01/09.
 */
public class Card {
    public Suit suit;
    public Rank rank;

    private String thisSuit;
    private String thisRank;

    public Card(Suit suit, Rank rank){
       this.suit  = suit;
       this.rank = rank;
    }

    public Card(){
        this.thisRank = "";
        this.thisSuit = "";
    }

    public String getThisCardSuit(){
        thisSuit = suit.getSuit();
        return thisSuit;
    }

    public String getThisCardRank(){
        thisRank = rank.getRank();
        return thisRank;
    }
}
