package Piano;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;

public class Model {
    private String[] notes = {"CC", "C#", "DD", "D#", "EE", "FF", "F#", "GG", "G#", "AA", "A#", "BB"};
    private String cNote;
    private String octave;

    public void playNote(String note) {
        if (octave != null) {
            URL url = Model.class.getResource("/" + note + ".wav");
            AudioClip pNote = new AudioClip(url.toString());
            pNote.play();
        }
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

    public String getNote() { return cNote; }

    public String getOctave() { return octave; }
}
