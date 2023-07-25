package Tp_Joueur;

public class Main {
    public static void main(String[] args) {
        Joueur joueur1 = new Joueur("warriorDu59");

        for (int i = 1; i < 21; i++) {
            System.out.println(" le joueur " + joueur1.getNom() + " effectue la quete n° " + i);
            joueur1.effectuerUneQuete();
        }
    }
}