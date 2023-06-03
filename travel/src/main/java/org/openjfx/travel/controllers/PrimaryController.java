package org.openjfx.travel.controllers;

import java.io.IOException;

import org.openjfx.travel.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button PassageirosId;

    @FXML
    private Button locaisId;
    
    @FXML
    private Button viagensId;
    
    @FXML
    private Button veiculosId;
    
    @FXML
    private Button passagensId;
    
    @FXML
    private Button homeid;

    @FXML
    void switchToPassageiros(ActionEvent event) {
        try {
            App.setRoot("passageiros");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - passageiros.fxml");
            e.printStackTrace();
        }
    }
    
    @FXML
    void switckToLocais(ActionEvent event) {
        try {
            App.setRoot("locais");
        } catch (IOException e) {
            System.out.println("Erro! - Falha ao mudar para tela - locais.fxml");
            e.printStackTrace();
        }
    }
    
    @FXML
    void SwitchToViagens(ActionEvent event) {
        
    }

    @FXML
    void switchToVeiculos(ActionEvent event) {

    }
    
    @FXML
    void switchToPassagens(ActionEvent event) {

    }

    @FXML
    void switchToHome(ActionEvent event) {
        
    }
}