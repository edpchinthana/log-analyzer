package logRepository;

import java.io.IOException;
import java.util.List;

public interface LogRepository {
    List readLogFile(String path, String lastTimeStamp) throws IOException;

}
