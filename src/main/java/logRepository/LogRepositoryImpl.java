package logRepository;

import entity.AnalyticalDetail;
import entity.LogLine;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

public class LogRepositoryImpl implements LogRepository{
    boolean isReadFromBegin=false;
    String lastTimeStamp;

    @Override
    public List readLogFile(String path, String lastTimeStamp) throws IOException {
        List<String> updatedLogLines=new ArrayList();
        this.lastTimeStamp=lastTimeStamp;
        if(lastTimeStamp==null){
            isReadFromBegin=true;
        }
        try (Stream<String> lines = Files.lines(Paths.get(path), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> {
                try {
                    if(isReadFromBegin){
                        updatedLogLines.add(line);
                    }
                    else if(line.contains(lastTimeStamp)){
                        this.isReadFromBegin=true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            return updatedLogLines;
        }

    }


//    final String type="ERROR";
////    boolean isReadFromBegin=false;
//    List<LogLine> errorTimeList=new ArrayList();
//
//    public void analyzeReport(String line, boolean isReadFromBegin,String lastTimeStamp) throws ParseException {
//        this.isReadFromBegin=isReadFromBegin;
//        if(isReadFromBegin && line.indexOf(type)!=-1){
//            LogLine logLine=new LogLine(line.split(type)[0],line.split(type)[1]);
//            errorTimeList.add(logLine);
//        }
//        else if(line.contains(lastTimeStamp)){
//            this.isReadFromBegin=true;
//        }
//    }
//    public List<LogLine> getErrorTimeList(){
//        return errorTimeList;
//    }
//
//
//    final String error="ERROR";
//    final String warn="WARN";
//    final String info="INFO";
////    boolean isReadFromBegin=false;
//    long errorCount=0l;
//    long warnCount=0l;
//    long infoCount=0l;
//    public void makeSummary(String line, boolean isReadFromBegin, String lastTimeStamp) throws ParseException {
//        if (isReadFromBegin && line.indexOf(error) != -1) {
//            errorCount++;
//        } else if (isReadFromBegin && line.indexOf(warn) != -1) {
//            warnCount++;
//        } else if (isReadFromBegin && line.indexOf(info) != -1) {
//            infoCount++;
//        }else if(line.contains(lastTimeStamp)){
//            this.isReadFromBegin=true;
//        }
//    }
//    public AnalyticalDetail getAnalyticalDetails(){
//        return new AnalyticalDetail(errorCount,warnCount,infoCount);
//    }
}
