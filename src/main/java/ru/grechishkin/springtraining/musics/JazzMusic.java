package ru.grechishkin.springtraining.musics;

import ru.grechishkin.springtraining.Music;
import ru.grechishkin.springtraining.Song;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {

    List<Song> songs;

    public JazzMusic() {
        songs = new ArrayList<>();
        songs.add(new Song("Morning Delight - Papik, Frankie Lovecchio", "Типа звуковая дорожка Papik, Frankie Lovecchio"));
        songs.add(new Song("You & Me - Meute", "Типа звуковая дорожка Meute"));
        songs.add(new Song("Doors - Metaharmoniks", "Типа звуковая дорожка Metaharmoniks"));
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}
