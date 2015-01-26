package fiters;

import ninja.*;

/**
 * Created by Zen on 2015/01/21.
 */
public class SecureFilter implements Filter{
    @Override
    public Result filter(FilterChain filterChain, Context context) {
       if(context.getSession() == null || context.getSession().get("username") == null){
            return Results.redirect("/login");
       }
        return filterChain.next(context);
    }
}
