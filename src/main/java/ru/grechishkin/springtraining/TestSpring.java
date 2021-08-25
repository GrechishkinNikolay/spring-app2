package ru.grechishkin.springtraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml");
        RockMusic musicBean = context.getBean("rockMusic", RockMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        musicPlayer.setVolume(100);

        musicPlayer.playMusic();
        context.close();
    }
}
