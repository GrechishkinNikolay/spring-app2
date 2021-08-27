package ru.grechishkin.springtraining;

public class Song {
    private String name;
    private String audioTrack;

    public Song(String name, String audioTrack) {
        this.name = name;
        this.audioTrack = audioTrack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAudioTrack() {
        return audioTrack;
    }

    public void setAudioTrack(String audioTrack) {
        this.audioTrack = audioTrack;
    }
}
