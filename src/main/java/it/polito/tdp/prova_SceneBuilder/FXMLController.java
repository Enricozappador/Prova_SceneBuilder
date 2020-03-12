package it.polito.tdp.prova_SceneBuilder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nometxt;

    @FXML
    private TextField etatxt;

    @FXML
    private Button Inviobtn;

    @FXML
    private Label rispostatxt;

    @FXML
    void handleinvio(ActionEvent event) {
    	//System.out.println("invio"); 
    	
    	String nome = nometxt.getText(); 
    	if(nome.length()== 0) {
    		rispostatxt.setText("Devi inserire un nome!");
    		return ; 
    	}
    	String eta = etatxt.getText(); 
    	if(eta.length()== 0) {
    		rispostatxt.setText("Devi inserire un età!");
    		return ; 
    	}
    	
    	int etan ; 
    	try {
    		etan	= Integer.parseInt(eta);
    	}
    catch (NumberFormatException e) {
    	rispostatxt.setText("L'età deve essere numerica!");
		return ; 
    }
    	/*if(etan<1) {
    		rispostatxt.setText("Non si possono inserire età negative!");
    		return; 
    	}*/
    	String result =""; 
    	if(etan < 18) {
    		result = "Ciao, " +nome+ "!"; 
        	rispostatxt.setText(result);
    	}
    	else {
    	result = "Buongiorno, " +nome+ "!"; 
    	rispostatxt.setText(result);}
    }

    @FXML
    void initialize() {
        assert nometxt != null : "fx:id=\"nometxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert etatxt != null : "fx:id=\"etatxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Inviobtn != null : "fx:id=\"Inviobtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert rispostatxt != null : "fx:id=\"rispostatxt\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

