package ru.grechishkin.springtraining.musics;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import ru.grechishkin.springtraining.Music;
import ru.grechishkin.springtraining.Song;

public class ClassicalMusic implements Music {

    List<Song> songs;

    public ClassicalMusic() {
        songs = new ArrayList<>();
        songs.add(new Song("Антонио Вивальди. Летняя гроза", "Типа звуковая дорожка Вивальди"));
        songs.add(new Song("Иоганн Себастьян Бах. Шутка", "Типа звуковая дорожка Баха"));
        songs.add(new Song("Вольфганг Амадей Моцарт. Маленькая ночная серенада", "Типа звуковая дорожка Моцарта"));
    }

    @PostConstruct
    public void myInit() {
        System.out.println("myInit");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("myDestroy");
    }

    @Override
    public List<Song> getSongs() {
        return songs;
    }
}
