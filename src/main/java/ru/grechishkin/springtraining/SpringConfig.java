package ru.grechishkin.springtraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.grechishkin.springtraining.musics.ClassicalMusic;
import ru.grechishkin.springtraining.musics.JazzMusic;
import ru.grechishkin.springtraining.musics.RockMusic;

import java.util.Arrays;

@Configuration
//@ComponentScan("ru.grechishkin.springtraining")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(Arrays.asList(classicalMusic(),jazzMusic(),rockMusic()));
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
