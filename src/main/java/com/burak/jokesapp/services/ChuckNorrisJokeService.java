package com.burak.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class ChuckNorrisJokeService implements JokeService {



    @Override
    public String makeJoke() {
        String quote = new ChuckNorrisQuotes().getRandomQuote();
        return quote;
    }
}
