package logrepository;

import models.LogReport;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;

public interface LogRepository {
    LogReport getLogReport(String filePath, Timestamp lastTimestamp) throws IOException, ParseException;
}