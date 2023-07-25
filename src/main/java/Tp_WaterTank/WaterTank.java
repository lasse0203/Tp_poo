package Tp_WaterTank;

public class WaterTank {

    private double poidsVide;
    private double capaciteMax;
    private double niveauRemplissage;
    private static double totalVolume;

    public WaterTank(double poidsVide, double capaciteMax, double niveauRemplissage) {
        this.poidsVide = poidsVide;
        this.capaciteMax = capaciteMax;
        this.niveauRemplissage = niveauRemplissage;
        totalVolume+=niveauRemplissage;
    }

    // Méthode pour remplir
    public void remplir(double volume) {
        double capaciteLibre = capaciteMax - niveauRemplissage;
        if (volume > capaciteLibre) {
            System.out.println("Attention! vous dépassez le max");
        } else {
            this.niveauRemplissage += volume;
            totalVolume += volume;
            System.out.println("Volume total des WaterTank : " + WaterTank.getTotalVolume());
        }
    }

    // Méthode pour vider
    public void vider(double volume) {

        if (volume > niveauRemplissage) {
            System.out.println("Attention! il n'y a pas assez d'eau dans la citerne");
        } else {
            this.niveauRemplissage -= volume;
            totalVolume -= volume;
            System.out.println("Volume total des WaterTank : " + WaterTank.getTotalVolume());
        }
    }

    public double getPoidsTotal() {
        return poidsVide + niveauRemplissage;
    }

    public double getNiveauRemplissage() {
        return niveauRemplissage;
    }

    public static double getTotalVolume() {
        return totalVolume;
    }
}
