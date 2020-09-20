package emailsender;

import models.LogLine;
import models.LogReport;

import java.util.List;

public class EmailFormatter {

    public String getEmailBody(LogReport logReport){
        String body = "";
        List<LogLine> logLineList = logReport.getErrorList();
        for(LogLine logLine: logLineList){
            body = body +"\n" + logLine.getMessage();
        }

        return body;
    }
}