package model;

/**
 * Created by Zen on 2015/01/23.
 */
public class PlayerHand {
    private int id;
    private Game game;
    private User player;
    private Hand hand;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setGame(Game g){
        this.game = g;
    }

    public Game getGame(){
        return this.game;
    }

    public void setPlayer(User pl){
        this.player = pl;
    }

    public User getPlayer(){
        return this.player;
    }

    public void setHand(Hand h){
        this.hand = h;
    }

    public Hand getHand(){
        return this.hand;
    }

    public String toString(){
        return hand.toString();
    }
}
