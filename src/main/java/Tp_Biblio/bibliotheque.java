package Tp_Biblio;

import java.util.ArrayList;

class Bibliotheque {
    private ArrayList<Livre> Livre;

    public Bibliotheque() {
        Livre = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        Livre.add(livre);
    }

    public void supprimerLivre(Livre livre) {
        Livre.remove(livre);
    }

    public void afficherListeLivres() {
        for (Livre livre : Livre) {
            livre.afficherInformations();
            System.out.println();
        }
    }

    public void emprunterLivre(Livre livre) {
        livre.setEstEmprunte(true);
    }

    public void retournerLivre(Livre livre) {
        livre.setEstEmprunte(false);
    }
}
 