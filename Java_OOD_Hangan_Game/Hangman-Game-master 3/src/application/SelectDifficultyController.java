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

public class SelectDifficultyController extends DifficultyController implements Initializable{

	@FXML
	RadioButton Lvl_1;
	@FXML
	RadioButton Lvl_2;
	@FXML
	RadioButton Lvl_3;
	@FXML
	RadioButton Lvl_4;
	@FXML
	ToggleGroup Diff;
	@FXML
	Label label1;
	@FXML
	Button Btn_Next;
	@FXML
	Button Btn_Ok;
	@FXML
	Button Btn_Back;
	
	static int difficultyLevel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	@FXML
	public void selectingDifficulty(ActionEvent event){
		//indicated user can move on
		
		if (Lvl_1.isSelected() || Lvl_2.isSelected() || Lvl_3.isSelected() || Lvl_4.isSelected()) {
			RadioButton rb = (RadioButton) Diff.getSelectedToggle();
			int level = Character.getNumericValue(rb.getId().charAt(4));
			FileHandling.sortWordsIntoDifficulty(level+4);
			difficultyLevel = level + 4;
			Btn_Next.setDisable(false);
		}
	}
	
	@FXML
	protected void handleButtonAction(ActionEvent event) throws IOException {
		Stage secondaryStage;
        Parent root2;
        if (event.getSource() == Btn_Next) {
            // get reference to the button's stage
            secondaryStage = (Stage) Btn_Next.getScene().getWindow();
            // load up  FXML document
            root2 = FXMLLoader.load(getClass().getResource("TheGame.fxml"));
            // create a new scene with root and set the stage
            Scene scene2 = new Scene(root2);
            secondaryStage.setScene(scene2);
            secondaryStage.show();
        } else {
            if (event.getSource() == Btn_Back) {
                // get reference to the button's stage
                secondaryStage = (Stage) Btn_Back.getScene().getWindow();
                // load up  FXML document
                root2 = FXMLLoader.load(getClass().getResource("SelectWords.fxml"));
                // create a new scene with root and set the stage
                Scene scene2 = new Scene(root2);
                secondaryStage.setScene(scene2);
                secondaryStage.show();
            }
        }
	}

}
