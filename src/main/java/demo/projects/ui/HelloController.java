package demo.projects.ui;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button btnHello;

    @FXML
    private JFXTextField txtAbc;

    @FXML
    void helloAction(ActionEvent event) {

        txtAbc.setText("Hello There...");

    }

}