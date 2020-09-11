import logRepository.LogReader;
import logRepository.LogRowCount;

import java.io.IOException;

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
        String logPath="H:\\A_Padma_Codes\\Code_Java\\SampleLogGenarator\\src\\lk\\ac\\uok\\setu\\sampleLogFile.log";
        String timeStampsRecodePath="src\\main\\java\\timeStampsRecord.txt";

        LogRowCount logRowCount=new LogRowCount();

        long lastRowCount = 0;
        long newRowCount = logRowCount.getnewRowCount(logPath);

        LogReader logReaders=new LogReader();
        logReaders.readLog(logPath);
    }



}
