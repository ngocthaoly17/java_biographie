package org.example;

import java.util.ArrayList;

public class ClientBiographyVCollection {

    public static void main (String[] args) {

        BiographieVCollection BioMLK = new BiographieVCollection("MLT");
        BioMLK.add(new EvenementClef(new Date(15,1,1969), new String("Naissance à Atlanta, Georgie")));
        BioMLK.add(new EvenementClef(new Date(4,4,1968), new String("Assasinat")));
        BioMLK.add(new EvenementClef(new Date(14,10,1964), new String("MLK devient le plus jeune lauréat du prix Nobel de la paix")));
        BioMLK.add(new EvenementClef(new Date(28,8,1963), new String("Discours de Gettysburg I have a dream")));
        BioMLK.add(new EvenementClef(new Date(18,6,1963), new String("Mariage avec Correta Scott")));
        BioMLK.add(new EvenementClef(new Date(2,7,1964), new String("Le congres adopte le Civil Rights Act")));
        BioMLK.add(new EvenementClef(new Date(3,4,1968), new String("Discours prophétique : I have been to the MountainTop")));

        BioMLK.remove(new EvenementClef(new Date(4,4,1968), new String("Assasinat")));

        System.out.println(BioMLK);


    }



}
