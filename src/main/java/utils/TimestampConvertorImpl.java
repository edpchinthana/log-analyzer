package utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampConvertorImpl implements TimestampConvertor{
    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    public Timestamp stringToTimestamp(String dateStr) throws ParseException {
        Date date = dateFormat.parse(dateStr);
        return new Timestamp(date.getTime());
    }

    @Override
    public Boolean compareTo(Timestamp timestamp1, Timestamp timestamp2) {
        return timestamp1.after(timestamp2);
    }


}