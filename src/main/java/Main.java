import entity.LogLine;
import logRepository.*;

import java.io.IOException;
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



//    String logPath = "src\\main\\java\\test.log";

    public static void main(String[] args) throws IOException {


        LogRepositoryImpl logRepositoryImpl = new LogRepositoryImpl();
        NewLastTimeStamp newlastTimeStamp = new NewLastTimeStamp();
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        LogReporter logReporter = new LogReporter();


        String logPath = "H:\\A_Padma_Codes\\Code_Java\\log-analyzer\\src\\test.log";
        String timeStampsRecodePath = "src\\main\\java\\timeStampsRecord.txt";
        String previousLastTimeStamp = null;
        String newLastTimeStamp = null;
        previousLastTimeStamp = "2020-09-08T11:27:31Z"; //Take from configuration
        newLastTimeStamp = newlastTimeStamp.getLastTimeStamp(logPath);  //To overWrite configuration

//        List<LogLine> errorTimeStampList= logAnalyzer.getErrorTimeList(logPath, previousLastTimeStamp);  //To email
        List<LogLine> errorTimeStampList = logRepositoryImpl.getErrorTimeList();  //To email


        //~~~~~~~~~~~~~~~~~~Give ArrayList of LogLine for message Sending part~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        for (LogLine s : errorTimeStampList) {
            System.out.println(s.getTimeStamp());   ///Example
            System.out.println(s.getMessage());    ///Example
        } // /////////////////////////////////////
        System.out.println(newLastTimeStamp);

        LogRepositoryImpl logRepository = new LogRepositoryImpl();

        logRepositoryImpl.readLogFile(logPath, "2020-09-08T11:50:43Z");
        for (LogLine logLine : errorTimeStampList) {
            System.out.println("-- " + logLine.getTimeStamp() + " -- " + logLine.getMessage());
        }
       System.out.println("\nError Count- "+logRepositoryImpl.getAnalyticalDetails().getErrorCount() + ",  Warn Count- " + logRepositoryImpl.getAnalyticalDetails().getWarnCount() + ",  Info count- " + logRepositoryImpl.getAnalyticalDetails().getInfoCount());

    }

}
