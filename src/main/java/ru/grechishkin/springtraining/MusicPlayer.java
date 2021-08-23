package ru.grechishkin.springtraining;

import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;
    private int volume;
    private String name;

    public MusicPlayer() {
    }

    public void playMusic() {
        for (Music music :
            musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }
}
