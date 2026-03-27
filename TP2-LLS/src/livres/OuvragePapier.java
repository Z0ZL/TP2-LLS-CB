package livres;


import java.time.LocalDate;

public class OuvragePapier extends Ouvrage{
    private int nombrePages;

    public OuvragePapier(String titre, Auteur auteur, Format type, int nombrePages){
        super(titre, auteur, type);
        this.nombrePages = nombrePages;
    }


    public int getNombrePages() {
        return nombrePages;
    }
}
