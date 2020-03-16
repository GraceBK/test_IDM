public class Personne<String, TimeDuration> {
    
    public final String tag;
    public TimeDuration time;


    public Personne(String tag, TimeDuration time) {
        this.tag = tag;
        this.time = time;
    }


    
    static <String, TimeDuration> Personne<String, TimeDuration> of(String tag, TimeDuration time) {
        return new Personne<>(tag, time);
    }

    @Override
    public java.lang.String toString() {
        return "Personne{" +
                "tag=" + tag +
                ", time=" + time +
                '}';
    }
}
