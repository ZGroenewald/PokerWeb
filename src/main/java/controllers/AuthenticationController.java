package controllers;
import ninja.Result;
import ninja.Results;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import services.PokerService;

@Singleton
public class AuthenticationController {

    @Inject
    private PokerService pokerService;

    public Result index(){
        Result result = Results.html();
        return result;
    }

    public Result loginPage(){
        Result result = Results.html();

       //result.render("Hand", pokerService.dealHand().toString());
        return result;
    }

    public Result registerPage(){
        Result result = Results.html();

       // result.render("Hand", pokerService.dealHand().toString());
        return result;
    }

    public Result logout(){
        Result result = Results.html();
        return result;
    }
}
