package logRepository;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import java.io.File;
import java.io.IOException;


/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class NewLastTimeStamp {
    public String getLastTimeStamp(String logPath) throws IOException {
        LineIterator lineIterator = FileUtils.lineIterator(new File(logPath),"UTF-8");
        String lastLine="";
        while (lineIterator.hasNext()){
            lastLine=  lineIterator.nextLine();
        }
        return lastLine.split(" ")[0];
    }

}
