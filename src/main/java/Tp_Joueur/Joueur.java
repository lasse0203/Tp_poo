package Tp_Joueur;

public class Joueur {

    private  String nom;
    private int pointsExperience;
    private int niveau;


    public Joueur(){}

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public void effectuerUneQuete() {
        pointsExperience += 10;
        if (pointsExperience >= 100) {
            augmenterNiveau();
        }
    }

    public void augmenterNiveau(){
                niveau++;
                pointsExperience = 0;
        }

    @Override

    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", pointsExperience=" + pointsExperience +
                ", niveau=" + niveau +
                '}';
    }
}



