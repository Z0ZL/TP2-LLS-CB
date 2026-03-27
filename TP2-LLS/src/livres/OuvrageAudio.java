package livres;


import java.time.LocalDate;

public class OuvrageAudio extends Ouvrage {
    private int dureeMinutes;
    private EFormat type;

    public OuvrageAudio(String titre, Auteur auteur, Format type, LocalDate date, int dureeMinutes, EFormat format){
        super(titre, auteur, type);
        this.dureeMinutes = dureeMinutes;
        this.type = format;
    }

    public OuvrageAudio(String titre, Auteur auteur, Format type){
        super(titre, auteur, type);
    }


    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public EFormat getFormat() {
        return type;
    }
}
