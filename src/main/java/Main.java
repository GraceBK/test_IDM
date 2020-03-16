import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        TimeDuration duration = new TimeDuration(0);
        TimeDuration duration1 = new TimeDuration(732);
        TimeDuration duration2 = new TimeDuration(7242);
        System.out.println(duration.toString());
        System.out.println(duration1.toString());
        System.out.println(duration2.toString());
    }
}
