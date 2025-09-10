package org.example.reverse_file_content;

import java.io.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try(
                BufferedReader read = new BufferedReader(new FileReader(file));
                FileWriter writer = new FileWriter("reversed.txt");
            ){
            String lines = "";
            StringBuilder content = new StringBuilder();
            while((lines = read.readLine()) != null){
                content.append(lines + "\n");
            }

            content.reverse();
            writer.write(content.toString());


        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
