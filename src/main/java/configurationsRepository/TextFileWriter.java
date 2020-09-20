package configurationsRepository;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public interface TextFileWriter {
    void actionPerform(String logPath,String previousLastTimeStamp,String newLastTimeStamp, String recordPath);
}
