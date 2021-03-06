package utils;

import java.sql.Timestamp;
import java.text.ParseException;

public interface TimestampConvertor {
    Timestamp stringToTimestamp(String dateStr) throws ParseException;
    Boolean compareTo(Timestamp timestamp1, Timestamp timestamp2);
    String timestampToString(Timestamp timestamp);
    String timestampToStringForConfiguration(Timestamp timestamp);
}
