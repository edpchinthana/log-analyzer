package logRepository;

import java.io.*;
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
//                System.out.println(data);
//                System.out.println(data);
                if(t1.equals(data)){
                    System.out.print(data+" ,Time =   ");
                    System.out.println(System.currentTimeMillis()-lastTime);
                }
                if(t2.equals(data)){
                    System.out.print(data+", Time =   ");
                    System.out.println(System.currentTimeMillis()-lastTime);
                }
                if(t3.equals(data)){
                    System.out.print(data+", Time =   ");
                    System.out.println(System.currentTimeMillis()-lastTime);
                }

                count++;
            }
            System.out.println("NOt Found in 1st method");
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
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
            if(t2.equals(data)){
                System.out.print(data+", Time =   ");
                System.out.println(System.currentTimeMillis()-lastTime);
            }
            if(t3.equals(data)){
                System.out.print(data+", Time =   ");
                System.out.println(System.currentTimeMillis()-lastTime);
            }
//            else
            count++;

        } while (data != null);
        System.out.println("NOt Found in 1st method");
        fr.close();
        System.out.println(count);
        System.out.print("The task perform ");
        System.out.println(System.currentTimeMillis()-lastTime);
        System.out.println();
    }


}
