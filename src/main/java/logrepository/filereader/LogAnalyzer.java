package logrepository.filereader;

import models.LogReport;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;

public interface LogAnalyzer {
    LogReport analyzeLogFile(BufferedReader bufferedReader, Timestamp lastTimestamp) throws ParseException, IOException;
}