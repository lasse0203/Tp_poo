package org.example;

public class Chaise {

    public int pieds;
    public String materiel;
    public String couleur;

    public double prix;

    public Chaise() {
    }

    ;

    public Chaise(int pieds, String materiel, String couleur, double prix) {
        this.pieds = pieds;
        this.materiel = materiel;
        this.couleur = couleur;
        this.prix = prix;

    }
        @Override
        public String toString () {
            return "je suis une Chaise" +
                    " avec " + pieds + " pieds "+
                    " en " + materiel +
                    " de couleur " + couleur +
                    "à un prix " + prix ;
        }

        public void afficher(){
            System.out.println(this.toString());
        }
    }

