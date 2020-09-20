package configurationsRepository;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class UpdateFileTimeStamp implements TextFileWriter{

    @Override
    public void actionPerform(String logPath, String previousLastTimeStamp, String newLastTimeStamp, String recordPath) {
        String previousLogPathLine = logPath+ " | "+newLastTimeStamp;
        String newLogPathLine = logPath+" | "+newLastTimeStamp;

        try
        {
            BufferedReader br=new BufferedReader(new FileReader(recordPath));
            StringBuffer sb=new StringBuffer("");

            String line;
            while((line=br.readLine())!=null)
            {
                if(!line.equals(previousLogPathLine)) {
                    sb.append(line + "\n");
                }else {
                    sb.append(newLogPathLine+"\n");
                }

            }
            br.close();

            FileWriter fw=new FileWriter(new File(recordPath));
            fw.write(sb.toString());
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Something went horribly wrong: "+e.getMessage());
        }
    }
}