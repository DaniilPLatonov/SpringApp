package org.example.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());
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
