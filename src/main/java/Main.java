import entity.AnalyticalDetail;
import entity.LogLine;
import logRepository.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

public class Main {

    // Say Welcome
    //Ask log file path from user
    //Ask to analyse the log file
        //Have read this log previous time? (A)  ---- Check this logPath contain in TimeStampsRecord.txt
        //Have Change row Count? (B) ----Compare Last rowCount from timeStampsRecord.txt with new RowCount from LogAnalizer.java
            // if( (A) && not(B) ) -> Print "Log is not updated" Return-No work
            //if( (A) && (B) ) --> Get last N row of record form log file and analyze, get row count, last timeStamp   (C)
            //if( not(A) ) Get all rows of record from log file and and analyze, get row count, last timeStamp   (D)
                //(C)-> Update timeStamp, update rowcount in  TimeStampsRecord.txt
                //(D)-> Write in bottom timeStamp, bottom rowcount in  TimeStampsRecord.txt
            //IF analyzer return timeStamps ask to mailSender to make mails
                // Then mail Sender read email address from database and send them.
    // Print the status of send or not and email address and error founded timeStamps
    // Loop
        //Ask log file path from user or ask use previous path
        //Ask to analyse the log file


    public static void main(String[] args) throws IOException, ParseException {


        LogRepositoryImpl logRepositoryImpl = new LogRepositoryImpl();
        NewLastTimeStamp newlastTimeStamp = new NewLastTimeStamp();
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        LogReporter logReporter = new LogReporter();
        List<String> updatedLogLineList= new ArrayList();  //Don't delete
        String previousLastTimeStamp = null;
        String newLastTimeStamp = null;


        String logPath = "H:\\A_Padma_Codes\\Code_Java\\SampleLogGenarator\\src\\lk\\ac\\uok\\setu\\SampleLogFile2.log";

        String timeStampsRecodePath = "src\\main\\java\\timeStampsRecord.txt";

        previousLastTimeStamp = "2018-02-03T13:19:54:54Z"; //Take from configuration, this is dummy value for run my part
        newLastTimeStamp = newlastTimeStamp.getLastTimeStamp(logPath);  //To overWrite configuration
        updatedLogLineList=logRepositoryImpl.readLogFile(logPath,previousLastTimeStamp); //Read log file from previous LastTimeStamp and return lines as list
        List<LogLine> errorList= logAnalyzer.analyzeReport(updatedLogLineList); //Pass errorList to email method



        //Example for arrayList of error found which we sent to email
        System.out.println("\n  ~~~~ New error with error message (Email body) ~~~~");  ////////
        for (LogLine logLine : errorList) {                                           ////////
            System.out.println(logLine.getTimeStamp()+" --"+logLine.getMessage());    ////////
        }                                                                             ////////
        AnalyticalDetail analyticalDetail=logReporter.makeSummary(updatedLogLineList);   //Take errorCount, warnCount, infoCount as an AnalyticalDetail Object

        //For Output log summary details
        System.out.println("\n   ~~~~~ Console summary output ~~~~~~");
        System.out.println(" Error Count - "+analyticalDetail.getErrorCount());
        System.out.println(" Warn Count  - " + analyticalDetail.getWarnCount());
        System.out.println(" Info count  - " + analyticalDetail.getInfoCount());
        System.out.println(" Count Of recently updated log Line - "+updatedLogLineList.size());

        System.out.println("\n   ~~~~~ Hidden data ~~~~~~");
        System.out.println(" Previous Last TimeStamp - "+previousLastTimeStamp); //From Configuration to LogReader
        System.out.println(" New Last TimeStamp      - "+newLastTimeStamp);

    }

}
