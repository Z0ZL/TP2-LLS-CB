package livres;

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

    public void addOuvrage(Ouvrage ouvrage) {
        listeOuvrages.add(ouvrage);
    }

    public void removeOuvrage(Ouvrage ouvrage) {
        boolean suprimer = false;
        for (int i = 0; i < listeOuvrages.size(); i++) {
            if (listeOuvrages.get(i).equals(ouvrage)) {
                listeOuvrages.remove(ouvrage);
                System.out.println("L'ouvrage " + ouvrage.getTitre() + " a été suprimé de la liste.");
                suprimer = true;
                break;
            }
        }

        if (!suprimer) {
            System.out.println("L'ouvrage n'a pas été trouvé dans la liste.");
        }
    }
}
