package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class Controller {
    public Button button;
    public Label labela;

    public void promijenitekst(ActionEvent actionEvent) {
        labela.setText(LocalDate.now().toString());
    }
}
