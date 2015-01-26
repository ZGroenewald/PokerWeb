package controllers;
import ninja.Result;
import ninja.Results;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import services.PokerService;

import javax.naming.Context;

@Singleton
public class AuthenticationController {

    @Inject
    private PokerService pokerService;

    public Result index(){
        Result result = Results.html();
        return result;
    }

    public Result loginPage(Context context){
        Result result = Results.html();
        return result;
    }

    public Result registerPage(){
        Result result = Results.html();
        return result;
    }

    public Result logout(){
        Result result = Results.html();
        return result;
    }
}
