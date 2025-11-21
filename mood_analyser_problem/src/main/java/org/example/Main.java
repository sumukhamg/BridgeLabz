package org.example;

import org.example.MoodAnalyserException.MoodAnalyser;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            MoodAnalyser analyser = new MoodAnalyser("I am in No Mood");
            System.out.println(analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println(e.type + ": " + e.getMessage());
        }
    }
}