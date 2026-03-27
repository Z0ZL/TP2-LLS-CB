package livres;


public class OuvrageAudio {
    private int dureeMinutes;
    private String format;

    public OuvrageAudio(int dureeMinutes, String format){
        super();
        this.dureeMinutes = dureeMinutes;
        this.format = format;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public String getFormat() {
        return format;
    }
}
