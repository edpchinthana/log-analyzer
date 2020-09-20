package models;

import utils.TimestampConvertor;
import utils.TimestampConvertorImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class LogReport {
    private int errorCount;
    private int warnCount;
    private int infoCount;
    private List<LogLine> errorList;
    private Timestamp lastTimestamp;

    public LogReport() {
        this.errorCount = 0;
        this.warnCount = 0;
        this.infoCount = 0;
        this.errorList = new ArrayList<>();
    }

    public void addLogLine(LogLine logLine){
        switch (logLine.getType()){
            case ERROR:
                this.errorCount++;
                this.errorList.add(logLine);
                this.lastTimestamp = logLine.getTimestamp();
                break;
            case WARN:
                this.warnCount++;
                this.lastTimestamp = logLine.getTimestamp();
                break;
            case INFO:
                this.infoCount++;
                this.lastTimestamp = logLine.getTimestamp();
                break;
        }
    }

    public Timestamp getLastTimestamp() {
        return lastTimestamp;
    }

    public void setLastTimestamp(Timestamp lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    public String getLastTimestampStr(){
        TimestampConvertor convertor = new TimestampConvertorImpl();
        return convertor.timestampToString(this.lastTimestamp);
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public int getWarnCount() {
        return warnCount;
    }

    public void setWarnCount(int warnCount) {
        this.warnCount = warnCount;
    }

    public int getInfoCount() {
        return infoCount;
    }

    public void setInfoCount(int infoCount) {
        this.infoCount = infoCount;
    }

    public List<LogLine> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<LogLine> errorList) {
        this.errorList = errorList;
    }
}