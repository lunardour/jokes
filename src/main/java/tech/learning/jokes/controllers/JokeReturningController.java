package tech.learning.jokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.learning.jokes.services.JokeReturner;

@Controller
public class JokeReturningController {
    private final JokeReturner jokeReturner;

    public JokeReturningController(JokeReturner jokeReturner) {
        this.jokeReturner = jokeReturner;
    }

    @RequestMapping("/joke")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeReturner.getJoke());

        return "joke/index";
    }
}
