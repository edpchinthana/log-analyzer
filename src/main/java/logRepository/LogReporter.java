package logRepository;

import models.LogReport;

import java.text.ParseException;
import java.util.List;

public class LogReporter {
    final String error="ERROR";
    final String warn="WARN";
    final String info="INFO";
    int errorCount=0;
    int warnCount=0;
    int infoCount=0;
    public LogReport makeSummary(List<String> updatedErrorList) throws ParseException {
        for (String line : updatedErrorList) {
            if (line.indexOf(error) != -1) {
                errorCount++;
            } else if (line.indexOf(warn) != -1) {
                warnCount++;
            } else if (line.indexOf(info) != -1) {
                infoCount++;
            }
        }
        return new LogReport(errorCount, warnCount, infoCount);

    }



}
