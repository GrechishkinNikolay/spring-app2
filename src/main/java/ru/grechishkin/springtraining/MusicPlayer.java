package ru.grechishkin.springtraining;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private List<Music> musicList;

    private static Random random = new Random();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return musicList
                .get(random.nextInt(3))
                .getSongs()
                .get(random.nextInt(3))
                .getAudioTrack();
    }
}
