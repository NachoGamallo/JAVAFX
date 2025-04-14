package org.example.fx;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Pantalla2Controller {

    @FXML
    private TextField nombreTextField;

    @FXML
    private TextField precioTextField;

    @FXML
    private TableColumn <Bocadillo,String> nombreTableColumn;

    @FXML
    private TableColumn <Bocadillo,Double> precioTableColumn;

    @FXML
    private TableView <Bocadillo> tablaBocadillos;

    private ObservableList <Bocadillo> listaBocadillos = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        nombreTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        precioTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleDoubleProperty(data.getValue().getPrecio()).asObject());

        tablaBocadillos.setItems(listaBocadillos);
    }

    public void irAPantallaHello() throws IOException {
        HelloApplication.setRoot("hello-view");
    }

    public void guardarBocadillos(){
        String nombre = nombreTextField.getText();
        double precio = Double.parseDouble(precioTextField.getText());

        Bocadillo bocadillo = new Bocadillo(nombre,precio);
        listaBocadillos.add(bocadillo);

        System.out.println("Bocadillo creado " + bocadillo.getNombre() + " con precio " + bocadillo.getPrecio() + "€");
    }
}
