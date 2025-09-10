package org.example.write_user_input_to_a_file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try(FileWriter write = new FileWriter("input.txt")){
            System.out.println("Write Something in to the console");
            String line = scan.nextLine();
            write.write(line);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

