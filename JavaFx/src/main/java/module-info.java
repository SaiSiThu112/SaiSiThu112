module com.sst.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons.io;


    opens com.sst.javafx to javafx.fxml;
    exports com.sst.javafx;
}