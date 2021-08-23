package ru.grechishkin.springtraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

//        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}
