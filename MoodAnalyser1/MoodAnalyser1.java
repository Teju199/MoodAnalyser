package MoodAnalyser1;

public class MoodAnalyser1 {

    public String analyseMood(String message) {
        if(message.contains("sad")){
            return "sad";
        }
        else
            return "happy";
    }
}
