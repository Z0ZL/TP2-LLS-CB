package livres;

public class Pays {
    private String nomPays;
    private String codePays;
    private final static String codePaysDefault = "NAV";

    public Pays(String nom) {
        this.nomPays = nom;
        this.codePays = codePaysDefault;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setCodePays(String codePays) {
        if (verificationCodePays(codePays))
            this.codePays = codePays;
        else
            System.out.println("Code pays invalide");
    }

    public boolean verificationCodePays(String codePays) {
        boolean valide = false;

        if (codePays.equals(codePays.toUpperCase()) && codePays.length() == 3) {
            valide = true;
        }

        return valide;
    }

    public String getCodePays() {
        return codePays;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nomPays='" + nomPays + '\'' +
                ", codePays='" + codePays + '\'' +
                '}';
    }
}
