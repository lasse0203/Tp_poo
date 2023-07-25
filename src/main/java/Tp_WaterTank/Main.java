package Tp_WaterTank;

public class Main {
    public static void main(String[] args) {
        WaterTank waterTank1 = new WaterTank(100, 100,10);
        System.out.println("WaterTank 1 volume de départ : " + waterTank1.getNiveauRemplissage());
        WaterTank waterTank2 = new WaterTank(70,100, 25);
        System.out.println("WaterTank 2 volume de départ : " + waterTank2.getNiveauRemplissage());
        System.out.println("Volume total des WaterTank : " + WaterTank.getTotalVolume());
        waterTank1.remplir(5);
        waterTank2.remplir(60);
        waterTank1.vider(5);
        waterTank2.vider(20);
        waterTank1=new WaterTank(100, 100,75);
        System.out.println("WaterTank 1 volume de départ : " + waterTank1.getNiveauRemplissage());
        waterTank2=new WaterTank(70, 100,0);
        System.out.println("WaterTank 2 volume de départ : " + waterTank2.getNiveauRemplissage());



        System.out.println("Poids total de la citerne 1 : " + waterTank1.getPoidsTotal() + "Kg");
        System.out.println("Poids total de la citerne 2 : " + waterTank2.getPoidsTotal() + "Kg");


    }
}
