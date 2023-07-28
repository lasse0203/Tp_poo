package Tp_Biblio;

public class Livre {

        private String titre;
        private String auteur;

        private int nombrePage;

        private boolean estEmprunte;

    public Livre(String titre, String auteur, int nombrePage){
            this.titre = titre;
            this.auteur = auteur;
            this.nombrePage = nombrePage;
        }

        public String getNom () {
            return titre;
        }

        public void setNom (String titre){
            this.titre = titre;
        }

        public String getAuteur () {
            return auteur;
        }

        public void setAuteur (String auteur){
            this.auteur = auteur;
        }

        public int getNombrePage () {
            return nombrePage;
        }

        public void setNombrePage ( int nombrePage){
            this.nombrePage = nombrePage;
        }

        public boolean isEstEmprunte () {
            return estEmprunte;
        }

        public void setEstEmprunte ( boolean estEmprunte){
            this.estEmprunte = estEmprunte;
        }



    public void afficherInformations() {
        System.out.println( "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nombrePage=" + nombrePage +
                ", estEmprunte=" + estEmprunte +
                '}');
    }
}
