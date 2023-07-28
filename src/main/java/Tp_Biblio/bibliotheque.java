package Tp_Biblio;

import java.util.ArrayList;

class Bibliotheque {
    private ArrayList<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void supprimerLivre(Livre livre) {
        livres.remove(livre);
    }

    public void afficherListeLivres() {
        for (Livre livre : livres) {
            livre.afficherInformations();
            System.out.println();
        }
    }

    public ArrayList<Livre> getLivres() {
        return livres;
    }

    public void emprunterLivre(Livre livre) {
        livre.setEstEmprunte(true);
    }

    public void retournerLivre(Livre livre) {
        livre.setEstEmprunte(false);
    }
}
 
