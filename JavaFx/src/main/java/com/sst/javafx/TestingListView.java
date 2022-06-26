package com.sst.javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TestingListView implements Initializable {

    @FXML
    private ListView<String> listview;

    @FXML
    private TextField input;

    public final ObservableList<String> brands = FXCollections.observableArrayList("Acer" , "Dell", "Chrome Book");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            listview.setItems(brands);
            listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    public void onAddClick(){
        if(input.getText().isEmpty()) return;
        listview.getItems().add(input.getText());
    }
    public void onDeleteClick(){
        ObservableList<String> items = listview.getSelectionModel().getSelectedItems();
        List<String> data = new ArrayList<>();
        for( String out : items){
            data.add(out);
        }
        for(String out : data){
            listview.getItems().remove(out);
        }
    }


}
