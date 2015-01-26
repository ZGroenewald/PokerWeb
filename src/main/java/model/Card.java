package model;
import freemarker.template.Template;
import freemarker.template.Configuration;

/**
 * Created by Zen on 2015/01/09.
 */
public class Card {
    public Suit suit;
    public Rank rank;
    public String imagePath = "";

    private String thisSuit;
    private String thisRank;

    public Card(Suit suit, Rank rank){
       this.suit  = suit;
       this.rank = rank;
        if(this.suit.getSuit() == "H"){
            imagePath += "/assets/images/Hearts/";
            if(this.rank.getRank() == "1"){imagePath += "1H.png";}
            else if(this.rank.getRank() == "2"){imagePath += "2H.png";}
            else if(this.rank.getRank() == "3"){imagePath += "3H.png";}
            else if(this.rank.getRank() == "4"){imagePath += "4H.png";}
            else if(this.rank.getRank() == "5"){imagePath += "5H.png";}
            else if(this.rank.getRank() == "6"){imagePath += "6H.png";}
            else if(this.rank.getRank() == "7"){imagePath += "7H.png";}
            else if(this.rank.getRank() == "8"){imagePath += "8H.png";}
            else if(this.rank.getRank() == "9"){imagePath += "9H.png";}
            else if(this.rank.getRank() == "10"){imagePath += "10H.png";}
            else if(this.rank.getRank() == "J"){imagePath += "JH.png";}
            else if(this.rank.getRank() == "Q"){imagePath += "QH.png";}
            else if(this.rank.getRank() == "K"){imagePath += "KH.png";}
        }
        else if(this.suit.getSuit() == "C"){
            imagePath += "/assets/images/Clubs/";
            if(this.rank.getRank() == "1"){imagePath += "1C.png";}
            else if(this.rank.getRank() == "2"){imagePath += "2C.png";}
            else if(this.rank.getRank() == "3"){imagePath += "3C.png";}
            else if(this.rank.getRank() == "4"){imagePath += "4C.png";}
            else if(this.rank.getRank() == "5"){imagePath += "5C.png";}
            else if(this.rank.getRank() == "6"){imagePath += "6C.png";}
            else if(this.rank.getRank() == "7"){imagePath += "7C.png";}
            else if(this.rank.getRank() == "8"){imagePath += "8C.png";}
            else if(this.rank.getRank() == "9"){imagePath += "9C.png";}
            else if(this.rank.getRank() == "10"){imagePath += "10C.png";}
            else if(this.rank.getRank() == "J"){imagePath += "JC.png";}
            else if(this.rank.getRank() == "Q"){imagePath += "QC.png";}
            else if(this.rank.getRank() == "K"){imagePath += "KC.png";}
        }
        else if(this.suit.getSuit() == "D"){
            imagePath += "/assets/images/Diamonds/";
            if(this.rank.getRank() == "1"){imagePath += "1D.png";}
            else if(this.rank.getRank() == "2"){imagePath += "2D.png";}
            else if(this.rank.getRank() == "3"){imagePath += "3D.png";}
            else if(this.rank.getRank() == "4"){imagePath += "4D.png";}
            else if(this.rank.getRank() == "5"){imagePath += "5D.png";}
            else if(this.rank.getRank() == "6"){imagePath += "6D.png";}
            else if(this.rank.getRank() == "7"){imagePath += "7D.png";}
            else if(this.rank.getRank() == "8"){imagePath += "8D.png";}
            else if(this.rank.getRank() == "9"){imagePath += "9D.png";}
            else if(this.rank.getRank() == "10"){imagePath += "10D.png";}
            else if(this.rank.getRank() == "J"){imagePath += "JD.png";}
            else if(this.rank.getRank() == "Q"){imagePath += "QD.png";}
            else if(this.rank.getRank() == "K"){imagePath += "KD.png";}
        }
        else if(this.suit.getSuit() == "S"){
            imagePath += "/assets/images/Spades/";
            if(this.rank.getRank() == "1"){imagePath += "1S.png";}
            else if(this.rank.getRank() == "2"){imagePath += "2S.png";}
            else if(this.rank.getRank() == "3"){imagePath += "3S.png";}
            else if(this.rank.getRank() == "4"){imagePath += "4S.png";}
            else if(this.rank.getRank() == "5"){imagePath += "5S.png";}
            else if(this.rank.getRank() == "6"){imagePath += "6S.png";}
            else if(this.rank.getRank() == "7"){imagePath += "7S.png";}
            else if(this.rank.getRank() == "8"){imagePath += "8S.png";}
            else if(this.rank.getRank() == "9"){imagePath += "9S.png";}
            else if(this.rank.getRank() == "10"){imagePath += "10S.png";}
            else if(this.rank.getRank() == "J"){imagePath += "JS.png";}
            else if(this.rank.getRank() == "Q"){imagePath += "QS.png";}
            else if(this.rank.getRank() == "K"){imagePath += "KS.png";}
        }
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
