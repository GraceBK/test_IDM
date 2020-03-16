import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------- EXO 1 ------------------------------------------");

        TimeDuration duration = new TimeDuration(0);
        TimeDuration duration1 = new TimeDuration(732);
        TimeDuration duration2 = new TimeDuration(7242);
        System.out.println(duration.toString());
        System.out.println(duration1.toString());
        System.out.println(duration2.toString());

        System.out.println("------------------------- EXO 2 ------------------------------------------");

        Personne<String, TimeDuration> personne1 = new Personne<>("Grace1", new TimeDuration(0));
        Personne<String, TimeDuration> personne2 = new Personne<>("Grace2", new TimeDuration(0));
        Personne<String, TimeDuration> personne3 = new Personne<>("Grace3", new TimeDuration(0));

        List<Personne<String, TimeDuration>> personnes = new ArrayList<>();
        personnes.add(personne1);
        personnes.add(personne2);
        personnes.add(personne3);


        RaceResults test = new RaceResults(personnes);
        System.out.println("---- START ----");
        test.printResults();
        test.onNewResult("Grace1", new TimeDuration(732));
        System.out.println("---- END ----");
        test.printResults();
    }
}
