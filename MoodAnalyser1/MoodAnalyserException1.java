package MoodAnalyser1;

public class MoodAnalyserException1 {
    public String analyseMood(String message) {
        //using try catch to handle NullPointerException.
        try {
            if (message.contains("sad")) {
                return "sad";
            } else
                return "happy";
        }
        //when the mood entered is Null, it should return happy.
        catch(NullPointerException e){
            return "happy";
        }
    }
}
