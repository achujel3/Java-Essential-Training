package com.java.tutorials.tests.filesTests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest {

    public static void main(String[] args) {

        String sourceFile = "src/com/java/tutorials/tests/filesTests/files/loremIpsum.txt";
        String targetFile = "src/com/java/tutorials/tests/filesTests/files/target.txt";

        try (
                FileReader fileReader = new FileReader(sourceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(targetFile)
        ) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    fileWriter.write(line + "\n");
                }
            }
            System.out.println("File copied!");

        } catch (FileNotFoundException e) {
            System.out.println("No such file!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
