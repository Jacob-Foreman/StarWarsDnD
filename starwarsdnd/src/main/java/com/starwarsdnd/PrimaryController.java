package com.starwarsdnd;

import java.io.IOException;



import javafx.fxml.FXML;


public class PrimaryController{

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("characterSheet");
    }

    @FXML 
    private void switchToCharCreation_1() throws IOException{
        App.setRoot("characterCreation_1");
    }

}
