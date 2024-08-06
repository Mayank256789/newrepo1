import java.util.Random;

public class Mymain {
    public static void main(String[] args) {
        Random random = new Random();
        int upperBound = 10000;
        System.out.println( "random.nextInt() = " + random.nextInt() );
        for(int i = 1; i <= 1000; i++) {
            System.out.println(random.nextInt(upperBound));
        }

    }
}
