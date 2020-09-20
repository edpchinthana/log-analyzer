package output.commandline;

import models.LogReport;
import output.Output;

public class Summary{

    public void perform(LogReport logReport) {
        System.out.println("---------- Log Summary ----------");
        System.out.println("    ERROR -> " + logReport.getErrorCount()); //ERROR count
        System.out.println("    INFO  -> " + logReport.getInfoCount()); //INFO count
        System.out.println("    WARN  -> " + logReport.getWarnCount()); //WARN count

        //need to get ERROR count, INFO count, WARN count and print them

    }

}
