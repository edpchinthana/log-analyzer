package models;

public class LogReport {
    private int errorCount = 0;
    private int warnCount = 0;
    private int infoCount = 0;
//todo add varoiables to store loglines

    public LogReport(int errorCount, int warnCount, int infoCount) {
        this.errorCount = errorCount;
        this.warnCount = warnCount;
        this.infoCount = infoCount;
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
}
