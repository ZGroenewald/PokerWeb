package model;

/**
 * Created by Zen on 2015/01/09.
 */
public enum Rank {
    ACE ("1"),
    TWO ("2"),
    THREE ("3"),
    FOUR ("4"),
    FIVE ("5"),
    SIX ("6"),
    SEVEN ("7"),
    EIGHT ("8"),
    NINE ("9"),
    TEN ("10"),
    JACK ("J"),
    QUEEN ("Q"),
    KING ("K");

    private String rank;
    private Rank(String r){
        rank = r;
    }

    private static Rank fromRankSymbol(String sym){
        for(Rank rnk: Rank.values()){
            if(sym.equals(rnk.getRank())){
                return rnk;
            }
        }
        return null;
    }
    public String getRank(){
        return this.rank;
    }
}
