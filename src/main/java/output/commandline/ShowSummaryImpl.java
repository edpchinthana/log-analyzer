package output.commandline;

import models.LogReport;

public class ShowSummaryImpl implements ShowSummary {

    @Override
    public void perform(LogReport logReport) {
        System.out.println("----------------Log Summary--------------");
        System.out.println("-Error count : "+logReport.getErrorCount());
        System.out.println("-Warn count  : "+logReport.getWarnCount());
        System.out.println("-Info count  : "+logReport.getInfoCount());
        System.out.println("-Analyzed at : "+logReport.getLastTimestampStr());
        System.out.println("------------------------------------------");
    }
}
