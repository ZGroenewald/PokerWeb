package model.poker.Local;

import model.poker.Local.cards.Hand;
import model.poker.Local.evaluation.EvaluateHand;

public class App{
    public static void main( String[] args ) {
        Hand h1 = new Hand();
        System.out.println(h1.toString());

        // String[] sampleHand = {"10H", "4C", "JC", "2H", "2S"};
        // Hand h2 = new Hand(sampleHand);
        // System.out.println(h2.toString());
    }
}