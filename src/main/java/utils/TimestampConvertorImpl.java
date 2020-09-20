package utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimestampConvertorImpl implements TimestampConvertor{
    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    final SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public Timestamp stringToTimestamp(String dateStr) throws ParseException {
        Date date = dateFormat.parse(dateStr);
        return new Timestamp(date.getTime());
    }

    @Override
    public Boolean compareTo(Timestamp timestamp1, Timestamp timestamp2) {
        return timestamp1.after(timestamp2);
    }

    @Override
    public String timestampToString(Timestamp timestamp) {
        Date date = new Date();
        date.setTime(timestamp.getTime());
        return dateFormat2.format(date);
    }

    @Override
    public String timestampToStringForConfiguration(Timestamp timestamp) {
        Date date = new Date();
        date.setTime(timestamp.getTime());
        return dateFormat.format(date);
    }


}