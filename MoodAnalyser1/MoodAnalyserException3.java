package MoodAnalyser1;

public class MoodAnalyserException3 {
    String message;

    public  MoodAnalyserException3(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisExceptionForEmpty {
        try {
            if(message.length() == 0)
                throw new MoodAnalysisExceptionForEmpty(MoodAnalysisExceptionForEmpty.ExceptionType.ENTERED_EMPTY, "Please enter a mood");
            else if (message.contains("sad"))
                return "sad";
            else
                return "happy";
        } catch(NullPointerException e){
            throw new MoodAnalysisExceptionForEmpty(MoodAnalysisExceptionForEmpty.ExceptionType.ENTERED_NULL, "Please enter valid mood.");
        }
    }
}
