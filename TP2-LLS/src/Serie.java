import livres.Ouvrage;

import java.util.ArrayList;

public class Serie {

    private String nom;
    ArrayList<Ouvrage> listeOuvrages = new ArrayList<>();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Ouvrage> getListeOuvrages() {
        return listeOuvrages;
    }

    public void setListeOuvrages(ArrayList<Ouvrage> listeOuvrages) {
        this.listeOuvrages = listeOuvrages;
    }
}
