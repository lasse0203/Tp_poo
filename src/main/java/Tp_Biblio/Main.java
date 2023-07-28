package Tp_Biblio;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

<<<<<<< HEAD
        bibliotheque.ajouterLivre(new Livre("hello world", "me", 145));
        bibliotheque.ajouterLivre(new Livre("Me again", "me", 110));
        bibliotheque.ajouterLivre(new Livre("Black", "me", 11));
        bibliotheque.ajouterLivre(new Livre("Black", "me", 11));


        bibliotheque.afficherListeLivres();

        // Methode du supression  1 :

        Livre livre5=new Livre("titre5", "me", 11);
       bibliotheque.ajouterLivre(livre5);

        //bibliotheque.supprimerLivre(livre5);

        bibliotheque.afficherListeLivres();

        // methode du supression  2

        ArrayList<Livre> livres = bibliotheque.getLivres();

        for (Livre livre:livres) {
            if(livre.getNom().equals("titre5")) {
                bibliotheque.supprimerLivre(livre);
            }
        }
        bibliotheque.afficherListeLivres();
    }
}