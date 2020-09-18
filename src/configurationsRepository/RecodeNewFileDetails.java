package configurationsRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class RecodeNewFileDetails{
//    @Override
    public void actionPerform(String logPath, String recordPath) {
        try {
            Files.write(Paths.get(recordPath), (logPath + "\n").getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
