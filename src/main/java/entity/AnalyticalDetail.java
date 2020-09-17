package entity;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class AnalyticalDetail {
    private long errorCount;
    private long warnCount;
    private long infoCount;

    public AnalyticalDetail(long errorCount, long warnCount, long infoCount) {
        this.errorCount = errorCount;
        this.warnCount = warnCount;
        this.infoCount = infoCount;
    }

    public AnalyticalDetail() {
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getWarnCount() {
        return warnCount;
    }

    public void setWarnCount(long warnCount) {
        this.warnCount = warnCount;
    }

    public long getInfoCount() {
        return infoCount;
    }

    public void setInfoCount(long infoCount) {
        this.infoCount = infoCount;
    }
}
