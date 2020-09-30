package Piano;


import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
    void initialize() {
        Model app = new Model();

        c.setOnMousePressed(mouseEvent -> app.playNote("cc" + app.getOctave()));
        d.setOnMousePressed(mouseEvent -> app.playNote("DD" + app.getOctave()));
        e.setOnMousePressed(mouseEvent -> app.playNote("EE" + app.getOctave()));
        f.setOnMousePressed(mouseEvent -> app.playNote("FF" + app.getOctave()));
        g.setOnMousePressed(mouseEvent -> app.playNote("GG" + app.getOctave()));
        a.setOnMousePressed(mouseEvent -> app.playNote("AA" + app.getOctave()));
        b.setOnMousePressed(mouseEvent -> app.playNote("BB" + app.getOctave()));
        cs.setOnMousePressed(mouseEvent -> app.playNote("c#" + app.getOctave()));
        ds.setOnMousePressed(mouseEvent -> app.playNote("D#" + app.getOctave()));
        fs.setOnMousePressed(mouseEvent -> app.playNote("F#" + app.getOctave()));
        gs.setOnMousePressed(mouseEvent -> app.playNote("G#" + app.getOctave()));
        as.setOnMousePressed(mouseEvent -> app.playNote("A#" + app.getOctave()));

        start.setOnMousePressed(mouseEvent -> app.setNewNote());
        playNote.setOnMousePressed(mouseEvent -> app.playNote(app.getNote() + app.getOctave()));
    }
}
