package logRepository;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LogReader {

    public void readLog(String path) throws IOException {

        long lastTime=0l;
        long count=0;
        lastTime=System.currentTimeMillis();;
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                count++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(count);
        System.out.print("The task perform ");
        System.out.println(System.currentTimeMillis()-lastTime);



        lastTime=System.currentTimeMillis();;
        count=0l;
        String strpath=path;
        FileReader fr = new FileReader(strpath);
        BufferedReader br = new BufferedReader(fr);
        String ch;
        int time=0;

        String Conversion="";
        do {
            ch = br.readLine();
            count++;

        } while (ch != null);
        fr.close();
        System.out.println(count);
        System.out.print("The task perform ");
        System.out.println(System.currentTimeMillis()-lastTime);

    }



}
