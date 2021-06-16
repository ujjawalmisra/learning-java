package me.ujjawal.learning_java.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckedExceptions {
    public static void main(String[] args) {
        String content = "This is some random content";
        String filepath = "/tmp/test-check-exception";
        try {
            writeToFile(filepath, content);
        } catch (IOException e) {
            /**
             * Note: In order to generate the IOException create a dir with the name of the file
             */
            e.printStackTrace();
        }
    }

    private static void writeToFile(String filepath, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(filepath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(content);
        printWriter.close();
        fileWriter.close();
    }
}
