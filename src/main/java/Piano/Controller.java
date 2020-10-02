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
    private Text status;

    @FXML
    private Shape rect;


    private int count = 0;

    @FXML
    void initialize() throws IOException {
        String startStatus = "Press START to play";
        String rightStatus = "You're right! Next note...";
        String wrongStatus = "You're wrong. Press START to try again";
        String waitStatus = "GuessTheNote!";
        rect.setFill(new ImagePattern(new Image(getClass().getResource("/app.png").toExternalForm())));
        status.setText("Press START to play");
        updateScore();

        Note note = new Note();

        c.setOnMousePressed(mouseEvent -> {
            note.playNote("cc" + note.getOctave());
            if (note.checkNote("cc")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        d.setOnMousePressed(mouseEvent -> {
            note.playNote("DD" + note.getOctave());
            if (note.checkNote("DD")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        e.setOnMousePressed(mouseEvent -> {
            note.playNote("EE" + note.getOctave());
            if (note.checkNote("EE")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        f.setOnMousePressed(mouseEvent -> {
            note.playNote("FF" + note.getOctave());
            if (note.checkNote("FF")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        g.setOnMousePressed(mouseEvent -> {
            note.playNote("GG" + note.getOctave());
            if (note.checkNote("GG")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        a.setOnMousePressed(mouseEvent -> {
            note.playNote("AA" + note.getOctave());
            if (note.checkNote("AA")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        b.setOnMousePressed(mouseEvent -> {
            note.playNote("BB" + note.getOctave());
            if (note.checkNote("BB")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        cs.setOnMousePressed(mouseEvent -> {
            note.playNote("c#" + note.getOctave());
            if (note.checkNote("c#")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        ds.setOnMousePressed(mouseEvent -> {
            note.playNote("D#" + note.getOctave());
            if (note.checkNote("D#")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        fs.setOnMousePressed(mouseEvent -> {
            note.playNote("F#" + note.getOctave());
            if (note.checkNote("F#")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        gs.setOnMousePressed(mouseEvent -> {
            note.playNote("G#" + note.getOctave());
            if (note.checkNote("G#")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });
        as.setOnMousePressed(mouseEvent -> {
            note.playNote("A#" + note.getOctave());
            if (note.checkNote("A#")) {
                count++;
                status.setText(rightStatus);
            }
            else {
                count = 0;
                status.setText(wrongStatus);
            }
            updateScore();
        });

        start.setOnMousePressed(mouseEvent -> {
            note.setNewNote();
            status.setText(waitStatus);
        });
        playNote.setOnMousePressed(mouseEvent -> note.playNote(note.getNote() + note.getOctave()));
    }

    private void updateScore (){
        score.setText(String.valueOf(count));
    }
}
