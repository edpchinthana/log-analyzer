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
    List<LogLine> errorTimeList=new ArrayList();

    public List<LogLine> analyzeReport(List<String> updatedArrayList) throws ParseException {
        for (String line : updatedArrayList) {
            if(line.indexOf(type)!=-1){
                LogLine logLine=new LogLine(line.split(type)[0],line.split(type)[1]);
                errorTimeList.add(logLine);
            }
        }
        return errorTimeList;
    }




}
