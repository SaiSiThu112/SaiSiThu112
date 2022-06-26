package com.sst.javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TestingTableView implements Initializable {

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, Long> id;

    @FXML
    private TableColumn<Person, String> firstName;

    @FXML
    private TableColumn<Person, String> lastName;

    @FXML
    private TableColumn<Person , Integer> age;

    @FXML
    private TextField input;

    private final ObservableList<Person> people = FXCollections.observableArrayList(

            new Person(1L,"Taylor","Swift",30),
            new Person(2L,"Justin","Biber",26),
            new Person(3L,"Rich","Brian",24),
            new Person(4L,"Selena","Gomez",30)
            );


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        id.setCellValueFactory(new PropertyValueFactory<Person,Long>("id"));
        firstName.setCellValueFactory(new PropertyValueFactory<Person , String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<Person ,String>("lastName"));
        age.setCellValueFactory(new PropertyValueFactory<Person , Integer>("age"));

        personTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        personTable.setItems(people);
        personTable.setPlaceholder(new Label("No data in this person table!"));
    }

    public void onDeleteClicked(){
        ObservableList<Person> people = personTable.getSelectionModel().getSelectedItems();
        if(people.size()==0) return;

        List<Person> data = new ArrayList<>();
        for(Person out : people){
            data.add(out);
        }
        for(Person out : data){
            personTable.getItems().remove(out);
        }

    }

}
