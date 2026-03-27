package livres;

public class Pays {
    private String nomPays;
    private String codePays;

    public Pays(String nom) {
        this.nomPays = nom;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public boolean verificationCodePays(String codePays) {
        boolean valide = false;

        if (codePays.equals(codePays.toUpperCase()) && codePays.length() == 3) {
            valide = true;
        }

        return valide;
    }
}
