package logRepository;

import entity.LogLine;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogRepositoryImpl implements LogRepository{
    boolean isReadFromBegin=false;
    String lastTimeStamp;
//    int count =0;
//    final String type="ERROR";

//    @Override
    public void readLogFile(String path, String lastTimeStamp) throws IOException {
        this.lastTimeStamp=lastTimeStamp;
        LogAnalyzer logAnalyzer=new LogAnalyzer();
        if(lastTimeStamp==null){
            isReadFromBegin=true;
        }
        try (Stream<String> lines = Files.lines(Paths.get(path), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> {
                try {
                    logAnalyzer.analyzeReport(line,isReadFromBegin,lastTimeStamp);
//                    process(line);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });

        }
//        return errorTimeList;
//    }
//
    }
}
