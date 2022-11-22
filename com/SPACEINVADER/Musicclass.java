package com.SPACEINVADER;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musicclass {
    public void Bgsound(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src//misic/mo.WAV").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error with playing sound.");
        }
    }
}
