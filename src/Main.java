import configurationsRepository.GetLastTimeStamp;
import configurationsRepository.RecodeNewFileDetails;
import configurationsRepository.UpdateFileTimeStamp;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GetLastTimeStamp getLastTimeStamp=new GetLastTimeStamp();
        RecodeNewFileDetails recodeNewFileDetails=new RecodeNewFileDetails();
        UpdateFileTimeStamp updateFileTimeStamp=new UpdateFileTimeStamp();

        String recordPath=null;
        String logPath=null;
        String newLastTimeStamp=null;
        String previousLastTimeStamp=null;

        recordPath="src\\configurationsRepository\\TimeStampsRecord.txt";
        logPath="H:/A_Padma_Codes/Code_Java/log-analyzer/src/test.log";

        newLastTimeStamp="qqqqqqqqqqqqqq";


        //Ask previousLastTimeStamp. If this logFile is new this return "null". Other cases it returns previousLastTimeStamp from TimeStampRecord.
        previousLastTimeStamp=getLastTimeStamp.actionPerform(logPath,recordPath);
        System.out.println(previousLastTimeStamp);

        if(previousLastTimeStamp==null){
            //After log analyse && if log is new
            recodeNewFileDetails.actionPerform(logPath+ " | "+newLastTimeStamp, recordPath);
        }
        else{
            //After log analyse && if log is not new
           updateFileTimeStamp.actionPerform(logPath+" | "+previousLastTimeStamp,logPath+" | "+newLastTimeStamp, recordPath);
//            updateFileTimeStamp.modifyFile(recordPath, previousLastTimeStamp, newLastTimeStamp)


        }






    }
}
