package logRepository;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class LogRepositoryImpl implements LogRepository{
    String lastTimeStamp;
    private boolean isReadFromBegin;

    @Override
    public List readLogFile(String path, String lastTimeStamp) throws IOException {
        List<String> updatedLogLineList=new ArrayList();
        this.lastTimeStamp=lastTimeStamp;
        isReadFromBegin=false;
        if(lastTimeStamp==null){
            isReadFromBegin=true;
        }
        try (Stream<String> lines = Files.lines(Paths.get(path), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> {
                if(isReadFromBegin){
                    updatedLogLineList.add(line);
                }
                else if(line.contains(lastTimeStamp)||isReadFromBegin){
                    isReadFromBegin=true;
                }
            });
        }
        return updatedLogLineList;
    }

}
