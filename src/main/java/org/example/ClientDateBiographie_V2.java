package org.example;

public class ClientDateBiographie_V2 {

    public static void main (String[] args) throws ExceptionDate {

        int [] jour = {29,29,29,29,31,31,30};
        int [] mois = {2,2,2,2,3,3,4};
        int [] annee = {2000,2001,2002,2003,2004,2005,2000};

//        try {
//            Date_V2 monAnniv = new Date_V2(26,3, 1990);
//            Date_V2 Random = new Date_V2(15,13, 1998);
//            Date_V2 Random_2 = new Date_V2(15,9, 1400);
//            Date_V2 Random_3 = new Date_V2(32,9, 2025);
//        }

//        catch (ExceptionDate parExc) {
//
//            System.out.println(parExc.getMessage());
//            System.out.println(parExc.getJour());
//            System.out.println(parExc.getMois());
//            System.out.println(parExc.getAnnee());
//            System.out.println(parExc.getNumberOfErrors());
//        }

        for (int i=0; i<jour.length; i++) {
            try {
                new Date_V2(jour[i], mois[i], annee[i]);
            }
            catch (ExceptionDate parExc) {
                System.out.println(parExc.getNumberOfErrors());
            }
        }

    }
}