package org.example.count_words_in_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        try(BufferedReader read = new BufferedReader(new FileReader("input.txt"));
        ){
            String lines = "";
            int words = 0;
            while((lines = read.readLine()) != null){

                words += countWords(lines);
            }

            System.out.println("Total words in file: " + words);

        } catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public static int countWords(String str) {
        String[] totalWords = str.split(" ");
        return totalWords.length;
    }
}
