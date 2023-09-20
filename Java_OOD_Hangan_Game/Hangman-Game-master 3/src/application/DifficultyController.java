package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class DifficultyController implements Initializable {

    @FXML
    protected RadioButton Lvl_1;
    @FXML
    protected RadioButton Lvl_2;
    @FXML
    protected RadioButton Lvl_3;
    @FXML
    protected RadioButton Lvl_4;
    @FXML
    protected ToggleGroup Diff;
    @FXML
    protected Label label1;
    @FXML
    protected Button Btn_Next;
    @FXML
    protected Button Btn_Ok;
    @FXML
    protected Button Btn_Back;

    protected static int difficultyLevel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void selectingDifficulty(ActionEvent event) {
        
    }

    @FXML
    protected void handleButtonAction(ActionEvent event) throws IOException {
        
    }

}


