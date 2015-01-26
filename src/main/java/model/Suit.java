package model;

/**
 * Created by Zen on 2015/01/09.
 */
 public enum Suit{
    SPADES ("S"),
    HEARTS ("H"),
    CLUBS ("C"),
    DIAMONDS ("D");

    private String symbol;

    private Suit(String sym){
        symbol = sym;
    }

    private static Suit fromSuitSymbol(String sym){
        for(Suit s: Suit.values()){
            if(sym.equals(s.getSuit())){
                return s;
            }
        }
        return null;
    }

    public String getSuit() { return this.symbol; }
}
