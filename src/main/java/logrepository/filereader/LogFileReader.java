package logrepository.filereader;

import logrepository.LogRepository;
import models.LogReport;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.ParseException;

public class LogFileReader  implements LogRepository {

    @Override
    public LogReport getLogReport(String filePath, Timestamp lastTimestamp) throws IOException, ParseException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
        LogAnalyzer logAnalyzer = new LogAnalyzerImpl();
        LogReport logReport = logAnalyzer.analyzeLogFile(bufferedReader, lastTimestamp);
        bufferedReader.close();
        return logReport;
    }
}