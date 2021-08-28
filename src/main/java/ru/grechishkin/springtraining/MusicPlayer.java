package ru.grechishkin.springtraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private List<Music> musics;

    @Value("${musicPlayer.volume}")
    private int volume;

    @Value("${musicPlayer.name}")
    private String name;

    private static Random random = new Random();

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        musics = new ArrayList<>();
        musics.add(music1);
        musics.add(music2);
    }

    public String playMusic(Genre genre) {
        String audioTrack = null;
        switch (genre) {
            case ROCK:
                audioTrack = musics
                        .get(0)
                        .getSongs()
                        .get(random.nextInt(3))
                        .getAudioTrack();
                break;
            case CLASSICAL_MUSIC:
                audioTrack = musics
                        .get(1)
                        .getSongs()
                        .get(random.nextInt(3))
                        .getAudioTrack();
                break;
        }
        return audioTrack;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musics=" + musics +
                ", volume=" + volume +
                ", name=" + name +
                '}';
    }
}
