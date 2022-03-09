package MoodAnalyser1;

public class MoodAnalyserException2 {
    private String message;

    public  MoodAnalyserException2(String message) {
        this.message = message;
    }

    public String
    analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("sad")) {
                return "sad";
            } else
                return "happy";
        } catch(NullPointerException e){
            throw new MoodAnalysisException("Please enter valid mood.");
        }
    }
}
