package com.sst.javafx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class TestingAlertDialog {
    @FXML
    void onNoBtnClicked(ActionEvent event) {
        Node source  = (Node)event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onYesBtnClicked(ActionEvent event) {
        Platform.exit();
    }

}
