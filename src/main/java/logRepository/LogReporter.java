package logRepository;

import entity.AnalyticalDetail;
import entity.LogLine;

import java.text.ParseException;
import java.util.List;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogReporter {
    final String error="ERROR";
    final String warn="WARN";
    final String info="INFO";
    long errorCount=0l;
    long warnCount=0l;
    long infoCount=0l;
    public AnalyticalDetail makeSummary(List<String> updatedErrorList) throws ParseException {
        for (String line : updatedErrorList) {
            if (line.indexOf(error) != -1) {
                errorCount++;
            } else if (line.indexOf(warn) != -1) {
                warnCount++;
            } else if (line.indexOf(info) != -1) {
                infoCount++;
            }
        }
        return new AnalyticalDetail(errorCount, warnCount, infoCount);

    }



}
