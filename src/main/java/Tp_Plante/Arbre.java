package Tp_Plante;

public class Arbre extends Plante {


    private double tronc;

    public Arbre(String nom, double hauteur, String couleur,double tronc) {
        super(nom, hauteur, couleur);
            this.tronc=20;
    }

    public double getTronc() {
        return tronc;
    }

    @Override
    public void afficher(){
        super.afficher();
        System.out.print("l'arbre est d'un tronc de "+tronc + "m.");

    }

}
