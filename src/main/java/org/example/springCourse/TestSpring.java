package org.example.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
/*
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
/*        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        Music music1 = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        musicPlayer1.playMusic();*/
        context.close();

        /*        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean compatison = firstmusicPlayer == secondmusicPlayer;

        System.out.println(compatison);
        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);

        firstmusicPlayer.setVolume(10);
        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());*/


        // System.out.println(musicPlayer.getName());
        // System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
