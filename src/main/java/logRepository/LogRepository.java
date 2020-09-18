package logRepository;

import entity.LogLine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public interface LogRepository {
    List readLogFile(String path, String lastTimeStamp) throws IOException;

}
