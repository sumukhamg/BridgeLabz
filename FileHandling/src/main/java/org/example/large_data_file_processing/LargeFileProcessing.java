package org.example.large_data_file_processing;

import java.io.*;

public class LargeFileProcessing {
    public static void main(String[] args) {
        String inputFile = "transactions.txt";
        String outputFile = "filtered_transactions.txt";
        double threshold = 5000.0;

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String transactionId = parts[0].trim();
                String customerId = parts[1].trim();
                double transactionAmount = Double.parseDouble(parts[2].trim());
                String date = parts[3].trim();

                if (transactionAmount > threshold) {
                    writer.write(transactionId + "," + customerId + "," + transactionAmount + "," + date);
                    writer.newLine();
                }
            }

            System.out.println("Filtered transactions written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
