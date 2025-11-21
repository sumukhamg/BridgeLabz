package org.example.MoodAnalyserException;

import org.example.MoodAnalysisException;

public class MoodAnalyser {

    private String message;

    // Default constructor
    public MoodAnalyser() { }

    // Parameterized constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // UC1, Refactor, UC2, UC3 implemented here
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                // Empty mood
                throw new MoodAnalysisException(
                        ExceptionType.EMPTY_MOOD,
                        "Mood cannot be EMPTY"
                );
            }

            if (message.contains("Sad") || message.contains("SAD") || message.contains("sad")) {
                return "SAD";
            } else if(message.contains("happpy") || message.contains("Happy") || message.contains("HAPPY")) {
                return "HAPPY";
            }
            else{
                return "Invalid Mood";
            }

        } catch (NullPointerException e) {
            // NULL Mood
            throw new MoodAnalysisException(
                    ExceptionType.NULL_MOOD,
                    "Mood cannot be NULL"
            );
        }
    }
}
