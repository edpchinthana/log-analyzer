package logRepository;

import entity.AnalyticalDetail;
import entity.LogLine;

import java.text.ParseException;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogReporter {
    final String error="ERROR";
    final String warn="WARN";
    final String info="INFO";
    boolean isReadFromBegin=false;
    long errorCount=0l;
    long warnCount=0l;
    long infoCount=0l;

    private AnalyticalDetail getAnalyticalDetails(String line, boolean isReadFromBegin, String lastTimeStamp) throws ParseException {
        if (isReadFromBegin && line.indexOf(error) != -1) {
            errorCount++;
        } else if (isReadFromBegin && line.indexOf(warn) != -1) {
            warnCount++;
        } else if (isReadFromBegin && line.indexOf(info) != -1) {
            infoCount++;
        }else if(line.contains(lastTimeStamp)){
            this.isReadFromBegin=true;
        }
        return new AnalyticalDetail(errorCount,warnCount,infoCount);
    }

}
