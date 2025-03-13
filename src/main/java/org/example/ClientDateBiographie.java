package org.example;

public class ClientDateBiographie {

    public static void main (String[] args) throws ExceptionDate {
        Date monanniv = new Date(3, 3, 1995);
        System.out.println(monanniv.toString());

        Date lePremier = new Date(2024);
        System.out.println(lePremier.toString());

        Biographie bioJeanJaures = new Biographie ("Jean Jaureas", 3);

        Date nouvelleDate = new Date(3,9,1859);
        Date nouvelleDate2 = new Date(2,9,1859);
        Date nouvelleDate3 = new Date(1,9,1859);
        bioJeanJaures.add(nouvelleDate);
        bioJeanJaures.add(nouvelleDate2);
        bioJeanJaures.add(nouvelleDate3);
        System.out.println(bioJeanJaures);

        Date_V2 dateincorrecte = new Date_V2(1, 3, 1240);
        System.out.println(dateincorrecte);

    }
}