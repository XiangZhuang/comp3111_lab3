package lab3.ex2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Lab3Controller {

    @FXML
    private Button btn_1;

    @FXML
    private Label label_1;

    @FXML
    void btn_pressed(ActionEvent event) {
    	label_1.setText("Welcome to JavaFX");
    }

}
