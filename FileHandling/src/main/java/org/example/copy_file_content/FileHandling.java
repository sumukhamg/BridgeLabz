package org.example.copy_file_content;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File destination = new File("destination.txt");

        try (
                BufferedReader reader = new BufferedReader(new FileReader(source));
                FileWriter writer = new FileWriter(destination)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred:");
            e.printStackTrace();
        }
    }
}
