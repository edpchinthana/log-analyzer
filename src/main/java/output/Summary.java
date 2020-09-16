package output;

public class Summary implements Output {

    public void print(String... prms) {

        System.out.println("---------- Log Summary ----------");
        System.out.println("    ERROR -> " + prms[0]); //ERROR count
        System.out.println("    INFO  -> " + prms[1]); //INFO count
        System.out.println("    WARN  -> " + prms[2]); //WARN count

        //need to get ERROR count, INFO count, WARN count and print them

    }

}
