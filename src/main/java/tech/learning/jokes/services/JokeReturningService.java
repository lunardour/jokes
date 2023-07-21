package tech.learning.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
import tech.learning.jokes.domain.ChuckNorrisJoke;

@Service
public class JokeReturningService implements JokeReturner {
    private final ChuckNorrisJoke chuckNorrisJoke;

    public JokeReturningService(ChuckNorrisJoke chuckNorrisJoke) {
        this.chuckNorrisJoke = chuckNorrisJoke;
    }

    public String getJoke() {
        return chuckNorrisJoke.getRandomQuote();
    }
}
