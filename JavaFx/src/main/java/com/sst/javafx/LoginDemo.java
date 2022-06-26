package com.sst.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginDemo {

    @FXML
    private Label result;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    public void show(ActionEvent event) throws IOException {
        if(username.getText().isEmpty()&&password.getText().isEmpty()){
            result.setText("Please enter both fields!");
        }
        else if(username.getText().isEmpty()){
            result.setText("Please enter username!");
        }
        else if(password.getText().isEmpty()){
            result.setText("Please enter password!");
        }
        else {
            if(username.getText().equals("user")&&password.getText().equals("123")){
                nextScene(event , "secondscene.fxml" );
            }
            else {
                result.setText("Login failed!");
            }
        }
    }
    private void nextScene(ActionEvent event , String fxml ) throws IOException {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

        Stage newStage = new Stage();
        FXMLLoader fxmlloader = new FXMLLoader(Application.class.getResource(fxml));
        javafx.scene.Scene scene = new javafx.scene.Scene(fxmlloader.load());

        newStage.setScene(scene);
        newStage.show();

    }
}
