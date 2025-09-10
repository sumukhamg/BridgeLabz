package org.example.read_and_display_file_content;
import java.io.*;

public class ReadAndDisplay {

    public static void main(String[] args) {
        File file = new File("input.txt");

        try (
                BufferedReader read = new BufferedReader(new FileReader(file));
        ) {
            String lines = "";
            while ((lines = read.readLine()) != null)
                System.out.println(lines);

        } catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
