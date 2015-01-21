package model.poker.Local.evaluation;

import model.poker.Local.cards.Card;
import model.poker.Local.cards.Hand;
import model.poker.Local.cards.Rank;
import model.poker.Local.cards.Suit;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Zen on 2015/01/09.
 */
public class EvaluateHand {

    public static String evaluateType(Hand h){

        if(EvaluateHand.isStraightFlush(h)){
            return "Straight Flush";
        }
        else if(EvaluateHand.isFourOfAKind(h)){
            return"Four of a Kind";
        }
        else if(EvaluateHand.isFullHouse(h)){
            return "Full House";
        }
        else if(EvaluateHand.isFlush(h)){
            return "Flush";
        }
        else if(EvaluateHand.isStraight(h)){
            return "Straight";
        }
        else if(EvaluateHand.isThreeOfAKind(h)){
            return "Three of a Kind";
        }
        else if (EvaluateHand.isTwoPair(h)){
            return "Two Pair";
        }
        else return "One Pair";

    }
    public static boolean isHighCard(Hand hand){
        if(!isOnePair(hand)
                && !isTwoPair(hand)
                && !isThreeOfAKind(hand)
                && !isStraight(hand)
                && !isFlush(hand)
                && !isFullHouse(hand)
                && !isFourOfAKind(hand)
                && !isStraightFlush(hand))
        {return true;}
        else return false;
    }

    public static boolean isOnePair(Hand hand){
          for(int i = 0; i < hand.getCards().size(); i++){
            int counter = 0;
            Card c = (Card)hand.getCards().get(i);
            for(int j = 0; j < hand.getCards().size(); ++j){
                if(i != j && ((Card)hand.getCards().get(j)).getThisCardRank() == c.getThisCardRank()){
                    ++counter;
                }
            }
            if(counter == 1){
                return true;
            }
        }
        return false;
    }

    public static boolean isTwoPair(Hand hand){
        int kindCounter = 0;
        for(int i = 0; i < hand.getCards().size(); i++){
            int counter = 0;
            Card c = (Card)hand.getCards().get(i);
            for(int j = 0; j < hand.getCards().size(); ++j){
                if(i != j && ((Card)hand.getCards().get(j)).getThisCardRank() == c.getThisCardRank()){
                    ++counter;
                }
            }
            if(counter == 2){
                ++kindCounter;
            }
        }
        if(kindCounter == 2){ return true;}
        else return false;
    }

    public static boolean isThreeOfAKind(Hand hand){
        for(int i = 0; i < hand.getCards().size(); i++){
            int counter = 0;
            Card c = (Card)hand.getCards().get(i);
            for(int j = 0; j < hand.getCards().size(); ++j){
                if(i != j && ((Card)hand.getCards().get(j)).getThisCardRank() == c.getThisCardRank()){
                    ++counter;
                }
            }
            if(counter == 3){
                return true;
            }
        }
        return false;
    }

    public static boolean isStraight(Hand hand){
        Suit tempSuit = null;
        boolean isStraight = false;

       /* boolean straight = false;
        int topStraightVal = 0;
        for(int i = 1; i <= 9; i++){
            if(hand.getAtIndex(i).getThisCardRank() == "1"
                    && hand.getAtIndex(i+1).getThisCardRank() == "1"
                    && hand.getAtIndex(i+2).getThisCardRank() == "1"
                    && hand.getAtIndex(i+3).getThisCardRank() == "1"){

            }
        }*/
        return  false;
    }

    public static boolean isFlush(Hand hand){
        boolean flush = true;
        for(int i = 0; i < hand.getCards().size(); i++){
            if(hand.getAtIndex(i).getThisCardSuit() != hand.getAtIndex(i+1).getThisCardSuit()){
                flush = false;
            }
        }
        return flush;
    }

    public static boolean isStraightFlush(Hand hand){
       /*List<Rank> ranks = hand.getCards().stream().map(c -> c.getThisCardRank()).collect(Collectors.toList());
        return hand.getCards().stream().allMatch(c -> c.getThisCardSuit() == hand.getCards().get(0).getThisCardSuit())
                && (ranks.stream().mapToInt((r -> r.ordinal()).max().getAsInt() - ranks.stream().mapToInt(r -> r.ordinal().min().getAsInt())))
                && ranks.stream().distinct().count() == 5;*/
        return false;
    }

    public static boolean isFullHouse(Hand hand){
        return false;
    }

    public static boolean isFourOfAKind(Hand hand){
       /* List<Long> counted = hand.getCards().stream()
                .collect(Collectors.groupingBy(o -> o.getThisCardRank().toString(), Collectors.counting()))
                .values().stream().sorted().collect(Collectors.toList());
        if(counted.size() == 2 && counted.get(1) ==4){
            return true;
        }
        else*/ return false;
    }
}
