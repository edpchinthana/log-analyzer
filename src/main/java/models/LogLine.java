package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogLine {
    private String message;
    private Date timeStampDate;


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//    SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    //Constructor
    public LogLine() {
    }

    //Constructor
    public LogLine(String timeStamp, String message) throws ParseException {
        this.timeStampDate = sdf.parse(timeStamp);
        this.message = message;
    }

    //return Timestamp
    public Date getTimeStamp() {
        return timeStampDate;
    }

    //return error details
    public String getMessage() {
        return message;
    }
}
