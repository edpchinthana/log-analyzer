package models;

import models.LogLine;

import java.util.ArrayList;
import java.util.List;

public class LogReport {
    private int errorCount;
    private int warnCount;
    private int infoCount;
    private List<LogLine> errorList;

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
                break;
            case WARN:
                this.warnCount++;
                break;
            case INFO:
                this.infoCount++;
                break;
        }
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