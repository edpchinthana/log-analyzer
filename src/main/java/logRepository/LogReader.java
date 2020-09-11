package logRepository;

import org.apache.commons.io.input.ReversedLinesFileReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
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





        System.out.println("NIO Reader : Load all file into RAM");
        lastTime=System.currentTimeMillis();
        Files.lines(Path.of(path))
                .filter(line -> line.contains("Padma"))
                .forEach(System.out::println);
//                .forEach(System.out::println);
        System.out.println(System.currentTimeMillis()-lastTime);
        lastTime=System.currentTimeMillis();;
        Files.lines(Path.of(path))
                .filter(line -> line.contains("Githmi"))
                .forEach(System.out::println);
//                .forEach(System.out::println);
        System.out.println(System.currentTimeMillis()-lastTime);
        System.out.println();



//
       lastTime=System.currentTimeMillis();
        try (FileInputStream is = new FileInputStream(path);
             BufferedInputStream bis = new BufferedInputStream(is)) {
            int b;
            while ((b = bis.read()) != -1) {
//                System.out.println("Byte: " + b);
//                System.out.print((char)b);
                if(t1.equals(b)){
                    System.out.print(b+", Time =   ");
                    System.out.println(System.currentTimeMillis()-lastTime);
                }
                if(t3.equals(b)){
                    System.out.print(b+", Time =   ");
                    System.out.println(System.currentTimeMillis()-lastTime);
                }
            }
            System.out.println("BufferedInputStream");
            System.out.println(System.currentTimeMillis()-lastTime); //171  // Read by a single letter



            lastTime=System.currentTimeMillis();
            try (FileReader reader = new FileReader(path);
                 BufferedReader bufferedReader = new BufferedReader((reader))) {
                int c;
                while ((c = bufferedReader.read()) != -1) {
//                    System.out.println("Char: " + (char) c);
                }
            }
            System.out.println("bufferedReader");
            System.out.println(System.currentTimeMillis()-lastTime);  //334   // Read by a single letter
        }





    }


}
