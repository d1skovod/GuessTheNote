package Piano;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

import java.io.IOException;

public class Controller {

    @FXML
    private Button c;

    @FXML
    private Button d;

    @FXML
    private Button e;

    @FXML
    private Button f;

    @FXML
    private Button g;

    @FXML
    private Button a;

    @FXML
    private Button b;

    @FXML
    private Button cs;

    @FXML
    private Button ds;

    @FXML
    private Button fs;

    @FXML
    private Button gs;

    @FXML
    private Button as;

    @FXML
    private Button start;

    @FXML
    private Button playNote;

    @FXML
    private Text score;

    @FXML
    private Shape rect;


    private int count = 0;

    @FXML
    void initialize() throws IOException {
        String img = getClass().getResource("/app.png").toExternalForm();
        rect.setFill(new ImagePattern(new Image(img)));
        Note note = new Note();
        updateScore();

        c.setOnMousePressed(mouseEvent -> {
            note.playNote("cc" + note.getOctave());
            if (note.checkNote("cc")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        d.setOnMousePressed(mouseEvent -> {
            note.playNote("DD" + note.getOctave());
            if (note.checkNote("DD")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        e.setOnMousePressed(mouseEvent -> {
            note.playNote("EE" + note.getOctave());
            if (note.checkNote("EE")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        f.setOnMousePressed(mouseEvent -> {
            note.playNote("FF" + note.getOctave());
            if (note.checkNote("FF")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        g.setOnMousePressed(mouseEvent -> {
            note.playNote("GG" + note.getOctave());
            if (note.checkNote("GG")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        a.setOnMousePressed(mouseEvent -> {
            note.playNote("AA" + note.getOctave());
            if (note.checkNote("AA")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        b.setOnMousePressed(mouseEvent -> {
            note.playNote("BB" + note.getOctave());
            if (note.checkNote("BB")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        cs.setOnMousePressed(mouseEvent -> {
            note.playNote("c#" + note.getOctave());
            if (note.checkNote("c#")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        ds.setOnMousePressed(mouseEvent -> {
            note.playNote("D#" + note.getOctave());
            if (note.checkNote("D#")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        fs.setOnMousePressed(mouseEvent -> {
            note.playNote("F#" + note.getOctave());
            if (note.checkNote("F#")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        gs.setOnMousePressed(mouseEvent -> {
            note.playNote("G#" + note.getOctave());
            if (note.checkNote("G#")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });
        as.setOnMousePressed(mouseEvent -> {
            note.playNote("A#" + note.getOctave());
            if (note.checkNote("A#")) {
                count++;
            }
            else {
                count = 0;
            }
            updateScore();
        });

        start.setOnMousePressed(mouseEvent -> note.setNewNote());
        playNote.setOnMousePressed(mouseEvent -> note.playNote(note.getNote() + note.getOctave()));
    }

    private void updateScore (){
        score.setText(String.valueOf(count));
    }
}
