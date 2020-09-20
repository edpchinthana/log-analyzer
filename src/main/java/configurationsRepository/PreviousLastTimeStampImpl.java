package configurationsRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class PreviousLastTimeStampImpl implements PreviousLastTimeStamp {
    String timeStamp=null;

    @Override
    public String getPreviousLastTimeStamp(String logPath, String recordPath) {
        Path path = Paths.get(recordPath);
        try {
            List contents = Files.readAllLines(path);

            //Read
            for (Object content : contents) {
                if(content.toString().startsWith(logPath)) {
                    return content.toString().split(" ")[2];
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
