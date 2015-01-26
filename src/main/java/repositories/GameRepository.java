package repositories;

import model.Game;
import model.Hand;
import model.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by Zen on 2015/01/23.
 */
public class GameRepository extends BaseRepository<Game> {
    public Optional<Game> findGameById(int id) {
        List<Game> results = getEntityManager().createQuery("SELECT g FROM poker_playerHand WHERE g.id = :id").getResultList();
        if(results.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(results.get(0));
    }
}
