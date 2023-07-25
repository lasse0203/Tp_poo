package org.example;

public class Main {

    public static void main(String[] args) {
        Chaise chaise1 = new Chaise(4, "chaine", "bleu" ,14.5);
        Chaise chaise2 = new Chaise(3,"bambou","gris",130.99);
        Chaise chaise3 = new Chaise(1,"métal","orange",76.25);

        System.out.println(chaise1.toString());
        System.out.println(chaise2.toString());
        System.out.println(chaise3.toString());
        }

    }
