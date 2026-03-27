package livres;


public class OuvrageAudio extends Ouvrage {
    private int dureeMinutes;
    private String format;

    public OuvrageAudio(String titre, Auteur auteur, Format type, int dureeMinutes, String format){
        super(titre, auteur, type);
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
