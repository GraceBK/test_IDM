import java.util.List;

public class RaceResults {


    List<Personne<String, TimeDuration>> personnes;

    RaceResults(List<Personne<String, TimeDuration>> personnes) {
        this.personnes = personnes;
    }

    public void onNewResult(String tagNumber, TimeDuration resultTime) {
        // Je recois et stocke un resultat
        for (Personne personne : personnes) {
            if (personne.tag == tagNumber) {
                personne.time = resultTime;
            }
        }
        //resultats.add(new Personne<>(tagNumber, resultTime));
    }

    public void printResults() {
        // Affiche le resultat classé par temps
        for (Personne personne : personnes) {
            System.out.println(personne.toString());
        }

    }

}
