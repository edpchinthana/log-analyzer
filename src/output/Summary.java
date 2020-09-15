package output;

public class Summary implements Output {

    public void print() {

        System.out.println("---------- Log Summary ----------");
        System.out.println("    ERROR -> "); //ERROR count
        System.out.println("    INFO  -> "); //INFO count
        System.out.println("    WARN  -> "); //WARN count

        //need to get ERROR count, INFO count, WARN count and print them

    }

}
