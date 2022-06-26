package com.sst.javafx;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestImageView {

    @FXML
    private ImageView imageView;

    public void onShowBtnClicked() {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add( new FileChooser.ExtensionFilter("Image File","*.png"));
        File selectedFile = fc.showOpenDialog(null);
        if(selectedFile==null) return;
        showImage(selectedFile.getAbsolutePath());
    }

    private void showImage(String path)  {
        Image image = null;
        try {
            InputStream stream = new FileInputStream(path);
            image = new Image(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(image==null) return;
        imageView.setImage(image);
    }
}
