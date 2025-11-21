import org.example.MoodAnalyserException.MoodAnalyser;
import org.example.MoodAnalysisException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoodAnalyserHappyTest {

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHAPPY() throws MoodAnalysisException {
        MoodAnalyser analyser = new MoodAnalyser("I am in Happy Mood");
        String mood = analyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }

    @Test
    public void givenMessage_WhenAnyMood_ShouldReturnHAPPY() throws MoodAnalysisException {
        MoodAnalyser analyser = new MoodAnalyser("I am in Any Mood");
//        String mood = analyser.analyseMood();
        Assertions.assertThrows( MoodAnalysisException.class, analyser::analyseMood);
    }

    @Test
    public void givenNullMood_ShouldThrowExceptionButHandled_ShouldReturnNullPointerException() {
        MoodAnalyser analyser = new MoodAnalyser(null);
        assertThrows(NullPointerException.class, analyser::analyseMood);
    }
}
