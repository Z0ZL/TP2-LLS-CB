package livres;


import java.time.LocalDate;

public class OuvrageVideo extends Ouvrage {
    private int dureeMinutes;
    private int tailleMb;

    public OuvrageVideo(String titre, Auteur auteur, Format type, LocalDate date, int dureeMinutes, int tailleMb){
        super(titre, auteur, type);
        this.dureeMinutes = dureeMinutes;
        this.tailleMb = tailleMb;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public int getTailleMb() {
        return tailleMb;
    }
}
