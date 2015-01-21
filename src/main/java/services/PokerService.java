package services;

import com.google.inject.Singleton;
import model.poker.Local.evaluation.EvaluateHand;
import model.poker.Local.cards.*;

/**
 * Created by Zen on 2015/01/12.
 */
@Singleton
public class PokerService {
    public String evaluateHand(Hand hand){
        return EvaluateHand.evaluateType(hand);
    }

    public Hand dealHand(){
       return new Hand();
    }
}
