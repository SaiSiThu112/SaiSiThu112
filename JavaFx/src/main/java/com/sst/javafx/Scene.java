package com.sst.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene {

        @FXML
        public void show(ActionEvent event) throws IOException {
                Node source = (Node)event.getSource();
                Stage stage = (Stage)source.getScene().getWindow();
                stage.close();
                nextScene("secondscene.fxml");
        }

        private void nextScene(String fxml) throws IOException {

                Stage stage = new Stage();
                FXMLLoader fxmlloader = new FXMLLoader(Application.class.getResource(fxml));
                javafx.scene.Scene scene = new javafx.scene.Scene(fxmlloader.load());

                stage.setScene(scene);
                stage.show();
        }


}
