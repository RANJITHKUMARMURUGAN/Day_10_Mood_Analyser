public class Moodanalyser {
    private String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if(message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
