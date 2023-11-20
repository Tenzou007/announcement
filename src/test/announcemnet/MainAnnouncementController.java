/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package test.announcemnet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author PC
 */
public class MainAnnouncementController implements Initializable {

   @FXML private ChoiceBox<String> abcd;
   
   @Override
    public void initialize(URL url, ResourceBundle rb) {
     abcd.getItems().addAll("Everyone", "Group", "Officers");
    }    
    
}

