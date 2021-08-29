package ru.grechishkin.springtraining.musics;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import ru.grechishkin.springtraining.Music;
import ru.grechishkin.springtraining.Song;

public class RockMusic implements Music {

    List<Song> songs;

    public RockMusic() {
        songs = new ArrayList<>();
        songs.add(new Song("Something - The Beatles", "Типа звуковая дорожка The Beatles"));
        songs.add(new Song("Dust in the Wind - Kansas", "Типа звуковая дорожка Kansas"));
        songs.add(new Song("I Was Made For Lovin' You", "Типа звуковая дорожка Kiss"));
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}
