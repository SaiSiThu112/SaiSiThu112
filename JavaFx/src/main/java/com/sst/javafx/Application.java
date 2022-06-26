package com.sst.javafx;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;


public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlloader = new FXMLLoader(Application.class.getResource("imageview.fxml"));
        Scene scene = new Scene(fxmlloader.load());

        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                windowEvent.consume();
                Stage nextStage = new Stage() ;
                FXMLLoader fxmlloader = new FXMLLoader(Application.class.getResource("alertdialog.fxml"));
                Scene scene = null;
                try {
                    scene = new Scene(fxmlloader.load());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                nextStage.setScene(scene);
                nextStage.show();
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
