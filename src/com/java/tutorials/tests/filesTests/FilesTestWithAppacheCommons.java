package com.java.tutorials.tests.filesTests;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FilesTestWithAppacheCommons {

    public static void main(String[] args) {

        File sourceFile = new File("src/com/java/tutorials/tests/filesTests/files/loremIpsum.txt");
        File targetFile = new File("src/com/java/tutorials/tests/filesTests/files/target3.txt");

        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
