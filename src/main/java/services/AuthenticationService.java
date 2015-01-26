package services;

import com.google.inject.Inject;
import model.User;
import repositories.UserRepository;

/**
 * Created by Zen on 2015/01/21.
 */
public class AuthenticationService {
    @Inject
    UserRepository userRepo;

    User user;

    public void register(String name, String pw){
        user = new User();
        user.setName(name);
        user.setPassword(pw);
        user.setSalt();
        userRepo.persist(user);
    }

    public boolean validate(String name, String pw){
        if(user.getName() == name && user.getPassword() == pw){
            return true;
        }
        else return false;
    }
}
