package logRepository;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogTest {
    boolean isReadFromBegin=false;
    long lastTime=0l;
    String lastTimeStamp;
    ArrayList<String> errorTimeList=new ArrayList<>();

    public ArrayList<String> getErrorTimeList(String path, String lastTimeStamp) throws IOException {
        this.lastTimeStamp=lastTimeStamp;
       if(lastTimeStamp==null){
           isReadFromBegin=true;
       }
        lastTime=System.currentTimeMillis();
        try (Stream<String> lines = Files.lines(Paths.get(path), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> process(line));
        }
        System.out.println(System.currentTimeMillis()-lastTime);

        return errorTimeList;

    }

    private void process(String line) {

        if(isReadFromBegin && line.indexOf("ERROR")!=-1){
            errorTimeList.add(line);
        }
        else if(lastTimeStamp.equals(line)){
            isReadFromBegin=true;
        }
    }
}
