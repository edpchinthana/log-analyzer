import configurationsRepository.GetLastTimeStamp;

public class Main {
    public static void main(String[] args) {
        GetLastTimeStamp getLastTimeStamp=new GetLastTimeStamp();

        String logPath=null;
        logPath="H:\\A_Padma_Codes\\Code_Java\\log-analyzer\\src\\test.log";
        String lastTimeStamp=null;
        lastTimeStamp=getLastTimeStamp.actionPerform(logPath);
        System.out.println(lastTimeStamp);
    }
}
