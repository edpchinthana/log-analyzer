package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogLine {

    private String message;
    String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String timeStamp = simpleDateFormat.format(new Date());

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
