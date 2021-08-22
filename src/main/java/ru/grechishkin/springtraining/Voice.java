package ru.grechishkin.springtraining;

public class Voice implements Music {

    @Override
    public String getSong() {
        return "Some voice";
    }
}
