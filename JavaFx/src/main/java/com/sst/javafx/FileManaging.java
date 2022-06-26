package com.sst.javafx;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class FileManaging {

    public static void main(String[] args) throws IOException {

        String currentPath = System.getProperty("user.dir");

        String createdPath = currentPath+"\\src\\main\\java\\com\\sst\\javafx\\img";
        File folder = new File( createdPath );
        if(!folder.exists()){
            folder.mkdir();
        }

        String oldPath = "C:\\Users\\Acer\\Desktop\\king.jpg";
        File old = new File( oldPath );
        String copyPath = createdPath+"\\"+old.getName();
        File copy = new File( copyPath );
        FileUtils.copyFile(old , copy);
    }
}
