package MoodAnalyser1;

public class MoodAnalyserWithConstructor {
    private String message;

    public  MoodAnalyserWithConstructor(String message) {
        this.message = message;
    }

    public String analyseMood1(){
        if(message.contains("sad")){
            return "sad";
        }
        else
            return "happy";
    }
}
