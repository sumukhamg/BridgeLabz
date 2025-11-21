package org.example;

import org.example.MoodAnalyserException.ExceptionType;

public class MoodAnalysisException extends Exception {

    public ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

