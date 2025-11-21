package org.example.MoodAnalyserException;

import org.example.MoodAnalysisException;

public class MoodAnalyser {

    private String message;
    // Parameterized constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }
    // Method checks edge cases and also give Respective Moods and also
    public String analyseMood() throws MoodAnalysisException {
        String mood = "";
//        try {
            if (message.contains("Sad") || message.contains("SAD") || message.contains("sad")) {
                mood = "Sad";
            } else if(message.contains("happy") || message.contains("Happy") || message.contains("HAPPY")) {
                mood = "Happy";
            }
            // If neither above condition worked, The message should be empty or invalid.
            // below else block is used to throw exception based on the edge cases
            else if(message.isEmpty()) {
                throw new MoodAnalysisException(
                        ExceptionType.EMPTY_MOOD,
                        "Mood cannot be EMPTY"
                );
            }
            else{
                throw new MoodAnalysisException(
                        ExceptionType.INVALID_MOOD, "Mood is invalid"
                );
            }

        return mood;
    }
}
