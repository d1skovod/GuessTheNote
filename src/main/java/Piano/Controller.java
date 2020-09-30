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
        c.setOnMousePressed(mouseEvent -> Model.playNote("cc" + Model.getOctave()));
        d.setOnMousePressed(mouseEvent -> Model.playNote("DD" + Model.getOctave()));
        e.setOnMousePressed(mouseEvent -> Model.playNote("EE" + Model.getOctave()));
        f.setOnMousePressed(mouseEvent -> Model.playNote("FF" + Model.getOctave()));
        g.setOnMousePressed(mouseEvent -> Model.playNote("GG" + Model.getOctave()));
        a.setOnMousePressed(mouseEvent -> Model.playNote("AA" + Model.getOctave()));
        b.setOnMousePressed(mouseEvent -> Model.playNote("BB" + Model.getOctave()));
        cs.setOnMousePressed(mouseEvent -> Model.playNote("c#" + Model.getOctave()));
        ds.setOnMousePressed(mouseEvent -> Model.playNote("D#" + Model.getOctave()));
        fs.setOnMousePressed(mouseEvent -> Model.playNote("F#" + Model.getOctave()));
        gs.setOnMousePressed(mouseEvent -> Model.playNote("G#" + Model.getOctave()));
        as.setOnMousePressed(mouseEvent -> Model.playNote("A#" + Model.getOctave()));
    }

}
