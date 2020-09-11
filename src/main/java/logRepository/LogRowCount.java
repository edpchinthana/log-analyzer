package logRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogRowCount {
    public static long getnewRowCount(String pathGiven) {
        Path path = Paths.get(pathGiven);
        long lines = 0;
        try {
            //lines = Files.lines(path).parallel().count(); // much slower, this task better with sequence access
            lines = Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }


}
