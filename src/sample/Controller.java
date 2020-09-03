package sample;

import com.sun.webkit.dom.KeyboardEventImpl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.awt.*;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;

    public void btnOneClickAction() {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();
        textField.clear();
        }

}


