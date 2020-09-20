package models;

import utils.TimestampConvertor;
import utils.TimestampConvertorImpl;

import java.sql.Timestamp;
import java.text.ParseException;

public class LogLine {
    private LogType type;
    private String message;
    private Timestamp timestamp;


    public LogLine(String logLineStr) throws ParseException {
        TimestampConvertor timestampConvertor = new TimestampConvertorImpl();
        LogType typeTemp = null;

        if(logLineStr.contains(LogType.ERROR.toString())){
            typeTemp = LogType.ERROR;
        }else if(logLineStr.contains(LogType.WARN.toString())){
            typeTemp = LogType.WARN;
        }else if(logLineStr.contains(LogType.INFO.toString())){
            typeTemp = LogType.INFO;
        }
        if(typeTemp!=null){
            this.type = typeTemp;
            this.timestamp = timestampConvertor.stringToTimestamp( logLineStr.split(type.toString())[0]);
            this.message = logLineStr.split(type.toString())[1];
        }

    }

    public String getTimestampStr() {
        TimestampConvertor convertor = new TimestampConvertorImpl();
        return convertor.timestampToString(timestamp);
    }

    public LogType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

}