package configurationsRepository;

import java.io.IOException;
import java.io.RandomAccessFile;

public interface PreviousLastTimeStamp {
    String getPreviousLastTimeStamp(String  logPath, String recordPath);
}
