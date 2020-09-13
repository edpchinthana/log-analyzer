package logRepository;

import entity.LogLine;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogRepository {
    boolean isReadFromBegin=false;
    String lastTimeStamp;
    ArrayList<LogLine> errorTimeList=new ArrayList<>();
    int count =0;
    final String type="ERROR";

    public ArrayList<LogLine> getErrorTimeList(String path, String lastTimeStamp) throws IOException {
        this.lastTimeStamp=lastTimeStamp;
        if(lastTimeStamp==null){
            isReadFromBegin=true;
        }
        try (Stream<String> lines = Files.lines(Paths.get(path), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> process(line));

        }
        return errorTimeList;
    }

    private void process(String line) {
        count++;
        if(isReadFromBegin && line.indexOf(type)!=-1){
            LogLine logLine=new LogLine(line.split(type)[0],line.split(type)[1]);
            errorTimeList.add(logLine);
        }
        else if(line.contains(lastTimeStamp)){
            isReadFromBegin=true;
        }

    }
}
