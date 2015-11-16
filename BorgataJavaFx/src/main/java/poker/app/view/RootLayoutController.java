package poker.app.view;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import enums.eGame;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser;
import poker.app.MainApp;

public class RootLayoutController implements Initializable {

    // Reference to the main application
    private MainApp mainApp;

    @FXML
    Menu mnuGame;
    
    @FXML
    ToggleGroup tglGames;
    
    @FXML
	RadioMenuItem FCS = new RadioMenuItem("5 Card Stud");
    
    @FXML
    RadioMenuItem THM = new RadioMenuItem("Texas Hold'em");
    
    @FXML
    RadioMenuItem OMH = new RadioMenuItem("Omaha");
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		
		tglGames.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
		    public void changed(ObservableValue<? extends Toggle> ov,
		        Toggle old_toggle, Toggle new_toggle) {
		            if (tglGames.getSelectedToggle() != null) {
		               if (tglGames.getSelectedToggle().equals(FCS))
		            	   mainApp.setiGameType(eGame.FiveStud);
		               else if (tglGames.getSelectedToggle().equals(THM))
		            	   mainApp.setiGameType(eGame.TexasHoldEm);
		               else if (tglGames.getSelectedToggle().equals(OMH))
		            	   mainApp.setiGameType(eGame.Omaha);
		            }                
		        }
		});
		
	}
    
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    

    /**
     * Creates an empty address book.
     */
    @FXML
    private void handleNew() {
    }

    /**
     * Opens a FileChooser to let the user select an address book to load.
     */
    @FXML
    private void handleOpen() {
    }

    /**
     * Saves the file to the person file that is currently open. If there is no
     * open file, the "save as" dialog is shown.
     */
    @FXML
    private void handleSave() {
    }

    /**
     * Opens a FileChooser to let the user select a file to save to.
     */
    @FXML
    private void handleSaveAs() {
    }

    /**
     * Opens an about dialog.
     */
    @FXML
    private void handleAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("ElitePokerGoldPro: Royal Flush VIP Edition");
        alert.setHeaderText("About ElitePokerGoldPro");
        alert.setContentText("Authors: Charles Collins and Olivia Smith");

        alert.showAndWait();
    }

    /**
     * Closes the application.
     */
    @FXML
    private void handleExit() {
        System.exit(0);
    }
    




}