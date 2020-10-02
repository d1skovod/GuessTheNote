package Piano;

import javafx.scene.media.AudioClip;

import java.net.URL;

public class Note {
    private String[] notes = {"cc", "c#", "DD", "D#", "EE", "FF", "F#", "GG", "G#", "AA", "A#", "BB"};
    private String cNote;
    private String octave;

    public void playNote(String note) {
        if (octave != null) {
            URL url = Note.class.getResource("/" + note + ".wav");
            AudioClip pNote = new AudioClip(url.toString());
            pNote.play();
        }
    }

    public void setNewNote() {
        cNote = notes[(int)(Math.random()*12)];
        octave = Integer.toString((int) (Math.random() * 5 + 1));
    }

    public boolean checkNote(String pNote) {
        if (pNote == cNote) {
            setNewNote();
            return true;
        }
        else {
            octave = null;
            return false;
        }
    }

    public String getNote() { return cNote; }

    public String getOctave() { return octave; }
}
