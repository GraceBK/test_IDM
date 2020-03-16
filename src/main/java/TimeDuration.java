public class TimeDuration {
    private int nbSeconds;
    private int hours;
    private int minutes;
    private int seconds;

    TimeDuration(int nbSeconds) throws Exception {
        if (nbSeconds < 0) throw new Exception("nombre de seconde negatif");
        this.nbSeconds = nbSeconds;
    }

    @Override
    public String toString() {
        return "TimeDuration de "+getNbSeconds()+" = "+getHours()+"h "+ getMinutes() +"m "+getSeconds()+"s";
    }


    /* GETTERS AND SETTERS */

    public int getNbSeconds() {
        return nbSeconds;
    }

    public int getHours() {
        int n = this.nbSeconds / 60;
        return n / 60;
    }

    public int getMinutes() {
        int n = this.nbSeconds / 60;
        return n % 60;
    }

    public int getSeconds() {
        return this.nbSeconds % 60;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
