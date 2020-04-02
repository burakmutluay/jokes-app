package com.burak.jokesapp.controllers;

import com.burak.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class ChuckNorrisJokeController {

    private final JokeService jokeService;


    public ChuckNorrisJokeController(@Qualifier("chuckNorrisJokeService") JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.makeJoke());
        return "chucknorris";
    }


}
