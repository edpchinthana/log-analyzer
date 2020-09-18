package configurationsRepository;

import java.io.IOException;
import java.io.RandomAccessFile;

public interface ConfigurationsRepository {
    public String recordPath="src\\configurationsRepository\\TimeStampsRecord.txt";
    RandomAccessFile raf = null;


    String actionPerform(String path) throws IOException;
}
