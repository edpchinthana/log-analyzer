package emailsender;

import models.LogLine;
import models.LogReport;

import java.util.List;

public class EmailFormatterImpl implements EmailFormatter{

    @Override
    public String getEmailBody(LogReport logReport){
        StringBuilder body = new StringBuilder();
        body.append("Log Analyzer Report");
        body.append("\n--------------------");
        body.append("\n-Error count : ").append(logReport.getErrorCount());
        body.append("\n-Warn count  : ").append(logReport.getWarnCount());
        body.append("\n-Info count  : ").append(logReport.getInfoCount());
        body.append("\n-Last log line at : ").append(logReport.getLastTimestampStr()).append("\n\n");
        body.append("--Error Logs--");
        List<LogLine> logLineList = logReport.getErrorList();
        for(LogLine logLine: logLineList){
            body.append("\n").append(logLine.getTimestampStr()).append(" ").append(logLine.getMessage());
        }
        body.append("\n-------------");
        return body.toString();
    }
}