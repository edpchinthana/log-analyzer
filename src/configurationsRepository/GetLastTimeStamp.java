package configurationsRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class GetLastTimeStamp implements ConfigurationsRepository{
    String timeStamp=null;
    @Override
    public String actionPerform(String  logPath) {
        Path path = Paths.get(recordPath);
        try {
            List contents = Files.readAllLines(path);

            //Read from the stream
            for (Object content : contents) {//for each line of content in contents
                if(content.toString().startsWith(logPath)) {
                    return content.toString().split(" ")[2];
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();//handle exception here
        }
        return null;

    }
}
