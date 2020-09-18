package configurationsRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class RecodeNewFileDetails implements TextFileWriter{

    @Override
    public void actionPerform(String logPath, String previousLastTimeStamp, String newLastTimeStamp, String recordPath) {
        String logPathDetail = logPath+ " | "+newLastTimeStamp;
        try {
            Files.write(Paths.get(recordPath), (logPathDetail + "\n").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
