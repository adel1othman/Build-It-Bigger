package com.example.adel.builditbigger.backend;

import com.example.adel.JokeTelling;

public class JokeBean {

    private JokeTelling jokeTelling;

    public JokeBean() {
        jokeTelling = new JokeTelling();
    }

    public String getJoke() {
        return jokeTelling.getRandomJoke();
    }
}