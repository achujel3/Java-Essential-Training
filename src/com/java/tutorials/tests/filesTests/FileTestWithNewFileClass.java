package com.java.tutorials.tests.filesTests;

import java.io.IOException;
import java.nio.file.*;

public class FileTestWithNewFileClass {

    public static void main(String[] args) {

        String path = "src/com/java/tutorials/tests/filesTests/files";

        Path sourceFile = Paths.get(path, "loremIpsum.txt");
        Path targetFile = Paths.get(path, "target2.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
