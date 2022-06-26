package com.sst.javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TestingComboBox implements Initializable {
    @FXML
    private TextField value;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private final ObservableList<String> laptops = FXCollections.observableArrayList("Dell" , "Lenovo" , "Acer");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(laptops);
    }
    public void comboBoxOnChange(){
        if(comboBox.getValue()==null) return;
        System.out.println(comboBox.getValue());
    }
    public void onAddClick(){
        if(value.getText().isEmpty()) {
            return;
        }
        comboBox.getItems().add(value.getText());
        value.setText("");
    }
    public void onDeleteClick(){
        if(value.getText()==null) return;
        comboBox.getItems().remove(comboBox.getValue());
    }
}
