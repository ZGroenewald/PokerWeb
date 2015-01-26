package services;

import com.google.inject.Inject;
import model.Game;
import model.User;
import repositories.GameRepository;
import repositories.UserRepository;

/**
 * Created by Zen on 2015/01/23.
 */
public class GameService {

    @Inject
    private UserRepository userRepo;
    @Inject
    private GameRepository gameRepo;
    @Inject
    private PokerService pokerService;

    Game game;

    public int createGame(String username){
        game = new Game();
        return game.getId();
    }

    public void addPlayer(User u){
        game.addPlayer(u);
    }
}
