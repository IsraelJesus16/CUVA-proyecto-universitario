package com.mycompany.cuvaproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VentanaController implements Initializable {

    @FXML
    private void onMostrarListaAction(ActionEvent event) {
    try {
    // 1. Cargar el nuevo archivo FXML de la lista
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Lista.fxml"));
    Parent root1 = (Parent) fxmlLoader.load();
    
    // 2. Crear una nueva escena y un nuevo escenario (Stage)
    Stage stage = new Stage();
    stage.setTitle("Lista de Usuarios - UNEFA");
    stage.setScene(new Scene(root1));  
    
    // 3. Mostrar la nueva ventana en pantalla
    stage.show();
    
} catch(IOException e) {
    System.out.println("Error al cargar la nueva ventana: " + e.getMessage());
}
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    
    
}
