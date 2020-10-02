package Piano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    Note note = new Note();

    @Test
    void setNewNoteTest() {
        for (int i = 0; i < 1000; i++) {
            note.setNewNote();
            int octave = Integer.parseInt(note.getOctave());
            assertTrue(octave <= 5 && octave >= 1);
        }
    }
}