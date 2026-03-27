package livres;


public class OuvrageVideo {
    private int dureeMinutes;
    private int tailleMb;

    public OuvrageVideo(int dureeMinutes, int tailleMb){
        super();
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
