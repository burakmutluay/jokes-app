package com.burak.jokesapp.controllers;

import com.burak.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ChuckNorrisJokeController {

    private final JokeService jokeService;


    public ChuckNorrisJokeController(@Qualifier("chuckNorrisJokeService") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String makeJoke(){
        return jokeService.makeJoke();
    }


}
