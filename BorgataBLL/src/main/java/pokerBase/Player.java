package pokerBase;

import domain.PlayerDomainModel;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class Player extends PlayerDomainModel {
	
	public TextField txtbox = null;	
	public Label namebox = null;
	public HBox pcards = null;	
	
	public Player(String PlayerName, int iPlayerPosition) {
		super(PlayerName, iPlayerPosition);
	}
	
	public TextField getTxtbox() {
		return txtbox;
	}

	public void setTxtbox(TextField txtbox) {
		this.txtbox = txtbox;
	}

	public Label getNamebox() {
		return namebox;
	}

	public void setNamebox(Label namebox) {
		this.namebox = namebox;
	}

	public HBox getPcards() {
		return pcards;
	}

	public void setPcards(HBox pcards) {
		this.pcards = pcards;
	}

	

}
