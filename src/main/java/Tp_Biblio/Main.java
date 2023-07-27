package Tp_Biblio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        bibliotheque.ajouterLivre(new Livre("hello world", "me", 145, false));
        bibliotheque.ajouterLivre(new Livre(" Me again", "me", 110, false));
        bibliotheque.ajouterLivre(new Livre("Black", "me", 11, true));
        bibliotheque.ajouterLivre(new Livre("Black", "me", 11, true));

        bibliotheque.afficherListeLivres();



        }

    }

