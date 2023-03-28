package EXO3;

public class conducteur {
    private String nom;
    private String numeroPermis;
    private int acceleration;

    public conducteur(String nom, String
            numeroPermis) {
        this.nom = nom;
        this.numeroPermis = numeroPermis;
    }

    public void conduit(Vehicule v) {
        System.out.println("je suis " + nom + " et je conduis un véhicule ");
        v.accelere(acceleration);
    }
}
