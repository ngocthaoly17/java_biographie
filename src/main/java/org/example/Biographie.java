package org.example;

import java.util.Arrays;

public class Biographie {

    String prenomNom;
    Date [] datescles;

    public Biographie(String prenomNom, int taille) {

        this.prenomNom = prenomNom;
        this.datescles = new Date[taille];

    }

    public String toString() {
        String res = new String("date cle de" + prenomNom + "\n");
        for (Date unedate : datescles) {
            res += "\t -" + unedate.toString() + "\n";
        }
        return res;
    }

    public boolean add(Date nouvelledate) {

        int i = 0;
        while (i< datescles.length && datescles[i] != null) {
            i++;
        }

        if (i == datescles.length) {
            return false;
        }
        datescles[i] = nouvelledate;
        return true;

    }

    public int search(Date date) {

        for (int i = 0; i < datescles.length; i++) {
            if (datescles[i] != null && datescles[i].compareTo(date) == 0) {
                return i;
            }
        }
        return -1;
    }

//    public int search(Date date) {
//        int i = 0;
//        while (i < datescles.length && datescles[i] != null && datescles[i].compareTo(date) == 0) {
//            i++;
//        }
//        if (i == datescles.length || datescles[i] == null) {
//            return -1;
//        }
//        return i;
//    }



}


