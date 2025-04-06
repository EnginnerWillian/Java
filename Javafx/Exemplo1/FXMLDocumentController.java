package Javafx.Exemplo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class FXMLDocumentController implements Initializable{
    @FXML
    private Label label
    @FXML 
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You click me!");
        label.setText("Hello Word!");
    }
    
} {
    
}
