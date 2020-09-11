package logRepository;

import org.apache.commons.io.input.ReversedLinesFileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogReader {

    public void checkTimeFinding(String path) throws IOException {
        String t1="Padma Gnanapriya 155000 line here";
        String t2="Pasindu Chthana 508990 line";
        String t3="Githmi Anjana 1048045 Line";

        long lastTime=0l;
        long count=0;
        lastTime=System.currentTimeMillis();
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(t1.equals(data)){
                    System.out.print(data+" ,Time =   ");
                    System.out.println(System.currentTimeMillis()-lastTime);
                }
                if(t3.equals(data)){
                    System.out.print(data+", Time =   ");
                    System.out.println(System.currentTimeMillis()-lastTime);
                }

                count++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(count);
        System.out.print("The task perform ");
        System.out.println(System.currentTimeMillis()-lastTime);
        System.out.println();





        lastTime=System.currentTimeMillis();;
        count=0l;
        String strpath=path;
        FileReader fr = new FileReader(strpath);
        BufferedReader br = new BufferedReader(fr);
        String data;
        int time=0;

        String Conversion="";
        do {
            data = br.readLine();
            if(t1.equals(data)){
                System.out.print(data+", Time =   ");
                System.out.println(System.currentTimeMillis()-lastTime);
            }
            if(t3.equals(data)){
                System.out.print(data+", Time =   ");
                System.out.println(System.currentTimeMillis()-lastTime);
            }
            count++;

        } while (data != null);
        fr.close();
        System.out.println(count);
        System.out.print("The task perform ");
        System.out.println(System.currentTimeMillis()-lastTime);
        System.out.println();






        lastTime=System.currentTimeMillis();;
        count=0l;
        ReversedLinesFileReader frr = new ReversedLinesFileReader(new File(strpath));
        String ch;
//        time=0;
        Conversion="";
        do {
            ch = frr.readLine();
            if(t1.equals(ch)){
                System.out.print(ch+", Time =   ");
                System.out.println(System.currentTimeMillis()-lastTime);
            }
            if(t3.equals(ch)){
                System.out.print(ch+", Time =   ");
                System.out.println(System.currentTimeMillis()-lastTime);
            }
            count++;

//            out.print(ch+"<br/>");
        } while (ch != null);
        frr.close();
        fr.close();
        System.out.println(count);
        System.out.print("The task perform ");
        System.out.println(System.currentTimeMillis()-lastTime);
        System.out.println();

    }


}
