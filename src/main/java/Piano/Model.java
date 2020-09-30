package Piano;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

import java.nio.file.Path;
import java.io.File;
import java.net.URI;
import java.nio.file.Paths;

public class Model {
    private String[] notes = {"CC", "C#", "DD", "D#", "EE", "FF", "F#", "GG", "G#", "AA", "A#", "BB"};
    private static String cNote;
    private static String octave = "2";

    public static void playNote(String note) {
        File f = new File("E:/idea/GuessTheNote/src/main/resources/" + note + ".wav");
        URI u = f.toURI();
        AudioClip pNote = new AudioClip(u.toString());
        pNote.play();
    }

    public void setNewNote() {
        cNote = notes[(int)(Math.random()*12)];
        octave = Integer.toString((int) (Math.random() * 5 + 1));
    }
    /*
    public void checkNote(String pNote, String cNote) {
        if (pNote == cNote) {
            //цвет меняется на зелёный
            setNewNote();
        }
        else {
            //цвет меняется на красный
            //рестарт
        }
    }
    */

    public String getNote() {
        return cNote;
    }

    public static String getOctave() {
        return octave;
    }
}
