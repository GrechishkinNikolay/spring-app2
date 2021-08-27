package ru.grechishkin.springtraining;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private List<Music> musicList;
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        musicList = new ArrayList<>();
        musicList.add(classicalMusic);
        musicList.add(rockMusic);
    }

    public String playMusic() {
        return "Playing: " + musicList.get(0).getSong() + " and " + musicList.get(1).getSong();
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                   "musicList=" + musicList +
                   ", volume=" + volume +
                   '}';
    }
}
