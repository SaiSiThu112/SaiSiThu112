package com.sst.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Testing {

    public int count;

    @FXML
    private Label label;

    public void increaseCount() {
        label.setText(String.valueOf(++count));
    }
}
