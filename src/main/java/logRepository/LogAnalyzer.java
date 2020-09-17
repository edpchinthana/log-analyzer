package logRepository;

import entity.LogLine;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogAnalyzer {
    final String type="ERROR";
    boolean isReadFromBegin=false;
    List<LogLine> errorTimeList=new ArrayList<LogLine>();


    public void analyzeReport(String line, boolean isReadFromBegin,String lastTimeStamp) throws ParseException {
        this.isReadFromBegin=isReadFromBegin;
        if(isReadFromBegin && line.indexOf(type)!=-1){
            LogLine logLine=new LogLine(line.split(type)[0],line.split(type)[1]);
            System.out.println(logLine);
            errorTimeList.add(logLine);
        }
        else if(line.contains(lastTimeStamp)){
            this.isReadFromBegin=true;
        }
    }

    public List<LogLine> getErrorTimeList(){
        System.out.println("ErroTimeList");
        return errorTimeList;
    }
}
