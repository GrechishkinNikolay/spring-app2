package ru.grechishkin.springtraining;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList;
    private int volume;

    public MusicPlayer(Music music) {
        this.musicList = new ArrayList<Music>();
        this.musicList.add(music);
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

    @Override
    public String toString() {
        return "MusicPlayer{" +
                   "musicList=" + musicList +
                   ", volume=" + volume +
                   ", name='" + name + '\'' +
                   '}';
    }
}
