package Tp_Film;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("La Haine","Mathieu Kassovitz", LocalDate.of(1995,05,31),"Drame");
        Film film2 = new Film("La Avatar2","James Cameron",LocalDate.of (2022,12,14),"Action");

        film1.afficher();
        film2.afficher();
    }
}

