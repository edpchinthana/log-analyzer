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


public class UpdateFileTimeStamp {
    //    @Override
    public void actionPerform(String previousLogPathLine,String newLogPathLine, String recordPath) throws IOException {
//        try (Stream<String> lines = Files.lines(Path.of(recordPath))) {
//            List<String> replaced = lines
//                    .map(line -> line.replaceAll(previousLogPathLine, newLogPathLine))
//                    .collect(Collectors.toList());
//            Files.write(Path.of(recordPath), replaced);
//        }

        try
        {
            BufferedReader br=new BufferedReader(new FileReader(recordPath));

            //String buffer to store contents of the file
            StringBuffer sb=new StringBuffer("");

            //Keep track of the line number
            int linenumber=1;
            String line;

            while((line=br.readLine())!=null)
            {
                //Store each valid line in the string buffer
                if(!line.equals(previousLogPathLine)) {
                    sb.append(line + "\n");
                }else {
                    sb.append(newLogPathLine+"\n");
                }

            }
            br.close();

            FileWriter fw=new FileWriter(new File(recordPath));
            //Write entire string buffer into the file
            fw.write(sb.toString());
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Something went horribly wrong: "+e.getMessage());
        }


    }

}