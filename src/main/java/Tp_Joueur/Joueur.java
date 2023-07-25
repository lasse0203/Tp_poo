package Tp_Joueur;

public class Joueur {

    private  String nom;
    private int pointsExperience;
    private int niveau;


    public Joueur(){}

    public Joueur(String nom) {
        this.nom = nom;
        this.niveau = 1;
        this.pointsExperience=0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsExperience() {
        return pointsExperience;
    }

    public void setPointsExperience(int pointsExperience) {
        this.pointsExperience = pointsExperience;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void effectuerUneQuete() {
        pointsExperience += 10;
            augmenterNiveau();

    }

    public void augmenterNiveau(){
        if (pointsExperience >= 100){
            niveau++;
                pointsExperience = 0;
                System.out.printf("Le joueur: %s passe au niveau %d !\n", nom, niveau);
        }
        }


}



