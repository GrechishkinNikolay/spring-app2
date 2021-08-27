package ru.grechishkin.springtraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private List<Music> musicList;
    private int volume;
    private Random random;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        musicList = new ArrayList<>();
        musicList.add(music1);
        musicList.add(music2);
    }

    public String playMusic(Genre genre) {
        switch (genre) {
            case CLASSICAL_MUSIC:
                return musicList.get(random.nextInt(2)).getSongs();
                break;
        }
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
