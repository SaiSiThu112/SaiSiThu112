package com.sst.javafx;

import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class TestFileChooser {

    public void onSingleBtnClicked() {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add( new FileChooser.ExtensionFilter("Image File","*.png"));
        File selectedFile = fc.showOpenDialog(null);
        if(selectedFile==null) return;
        System.out.println(selectedFile.getAbsolutePath());
    }

    public void onMultiBtnClicked() {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image File","*.png"),
                new FileChooser.ExtensionFilter("Image File","*.jpg")
                );
        List<File> selectedFiles = fc.showOpenMultipleDialog(null);
        if(selectedFiles.size()==0) return;
        for (File out: selectedFiles){
            System.out.println(out.getAbsolutePath());
        }
    }



}
