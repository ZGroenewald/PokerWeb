/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import com.google.inject.Inject;
import fiters.SecureFilter;
import ninja.FilterWith;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import org.hibernate.annotations.Filter;
import services.AuthenticationService;
import services.PokerService;

import ninja.Context;


@Singleton
public class ApplicationController {
    @Inject
    private PokerService pokerService;
    @Inject
    private AuthenticationService authService;

    public Result index(){
        Result result = Results.html();
        result.render("Hand", pokerService.dealHand().toString());
        return result;
    }

    public Result loginPage(){
        Result result = Results.html();
        result.render("loginPage.ftl.html");
        return result;
    }

    public Result login(Context context){
        String name = context.getParameter("firstname");
        String pass = context.getParameter("password");
        if(authService.validate(name, pass)) {
            context.getSession().put("username", name);
            return Results.redirect("/main");
        }
        else return Results.redirect("/login");
    }

    @FilterWith(SecureFilter.class)
    public Result mainPage(){
        Result result = Results.html();
        result.render("mainPage.ftl.html");
        result.render("Hand", pokerService.dealHand().toString());
        return result;
    }

    public Result registerPage(){
        Result result = Results.html();
        result.render("registerPage.ftl.html");
        return result;
    }

    public Result register(Context context){
        String name = context.getParameter("firstname");
        String pass1 = context.getParameter("password1");
        String pass2 = context.getParameter("password2");
        //check passwords
        if(pass1 == pass2) {
            authService.register(name, pass1);
            context.getSession().put("username", name);
            return Results.redirect("/main");
        }
        else return Results.redirect("/register");
    }

    public Result logout(){
        Result result = Results.html();
        result.render("loginPage.ftl.html");
        return result;
    }
}
