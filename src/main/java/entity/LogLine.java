package entity;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogLine {
    private String timeStamp;
    private String message;

    public LogLine() {
    }

    public LogLine(String timeStamp, String message) {
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }
}
