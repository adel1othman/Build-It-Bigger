package com.example.adel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokeTelling {

    private List<String> jokes;
    private Random random;

    public JokeTelling() {
        jokes = new ArrayList<>();

        jokes.add("Q: What did the Buffalo say to his son when he went off to college?\n" +
                "\n" +
                "A: Bison");
        jokes.add("Q: What did the toad say when he parked illegally?" +
                "\n" +
                "A: \"Just waiting for the bus because my car got toad.\"");
        jokes.add("Q: What do you get if you cross an angry sheep and a moody cow?"
                + "\n"
                + "A: An animal that's in a baaaaaaaaad mooooooooooood.");
        jokes.add("That's the seal-iest thing I've ever heard.");
        jokes.add("Q: What would bears be without Bees?"
                + "\n"
                + "A: Ears");
        random = new Random();
    }

    public List<String> getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        int myRandomJoke = random.nextInt(jokes.size());
        return jokes.get(myRandomJoke);
    }

}
