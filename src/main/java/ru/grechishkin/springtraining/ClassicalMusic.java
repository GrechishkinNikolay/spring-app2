package ru.grechishkin.springtraining;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Beethoven";
    }
}
