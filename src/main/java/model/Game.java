package model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zen on 2015/01/23.
 */
public class Game {

    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private User host;
   // @OneToMany(mappedBy = "game", cascade = cascadeType.ALL)
    private List<PlayerHand> playerHands = new ArrayList<>();
    private String status;

    public Game(){ }

    /*public Status getStatus(){
        return this.Status.
    }*/
    public int getId(){ return id; }

    public void removePlayer(User p){ playerHands.remove(p); }

    public void addPlayer(User p){
        PlayerHand playerHand = new PlayerHand();
        playerHand.setPlayer(p);
        playerHand.setGame(this);
        playerHands.add(playerHand);
    }
    public enum Status{
        ACTIVE,
        COMPLETE,
        CANCELLED;
    }
}
