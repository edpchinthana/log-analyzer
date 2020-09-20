package logrepository.filereader;

import models.LogLine;
import models.LogReport;
import utils.TimestampConvertor;
import utils.TimestampConvertorImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;

public class LogAnalyzerImpl implements LogAnalyzer {

    @Override
    public LogReport analyzeLogFile(BufferedReader bufferedReader, Timestamp lastTimestamp) throws ParseException, IOException {
        String line;
        TimestampConvertor timestampConvertor = new TimestampConvertorImpl();
        LogReport logReport = new LogReport();

        while((line = bufferedReader.readLine()) != null){
            LogLine logLine = new LogLine(line);
            if(timestampConvertor.compareTo(logLine.getTimestamp(),lastTimestamp)){
                logReport.addLogLine(logLine);
            }
        }
        bufferedReader.close();
        return logReport;
    }
}