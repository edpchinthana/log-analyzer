package configurationsRepository;

import java.io.RandomAccessFile;

public interface ConfigurationsRepository {
    String recordPath="src\\configurationsRepository\\TimeStampsRecord.txt";
    RandomAccessFile raf = null;


    public String actionPerform(String path);
}
