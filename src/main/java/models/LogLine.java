package models;

import utils.TimestampConvertor;
import utils.TimestampConvertorImpl;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogLine {
    private LogType type;
    private String message;
    private Timestamp timestamp;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public LogLine() {
    }

    public LogLine(LogType type, String message, Timestamp timestamp) {
        this.type = type;
        this.message = message;
        this.timestamp = timestamp;
    }

    public LogLine(String logLineStr) throws ParseException {
        TimestampConvertor timestampConvertor = new TimestampConvertorImpl();

        LogType type = null;
        if(logLineStr.contains(LogType.ERROR.toString())){
            type = LogType.ERROR;
        }else if(logLineStr.contains(LogType.WARN.toString())){
            type = LogType.WARN;
        }else if(logLineStr.contains(LogType.INFO.toString())){
            type = LogType.INFO;
        }
        if(type!=null){
            this.type = type;
            this.timestamp = timestampConvertor.stringToTimestamp( logLineStr.split(type.toString())[0]);
            this.message = logLineStr.split(type.toString())[1];
        }

    }

    public LogType getType() {
        return type;
    }

    public void setType(LogType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}