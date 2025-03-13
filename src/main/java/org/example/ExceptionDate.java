package org.example;

public class ExceptionDate extends Exception {

    private int jour;
    private int mois;
    private int annee;
    static int numberOfErrors = 0;

    public ExceptionDate(String parMessage, int parJour, int parMois, int parAnnee) {
        super(parMessage);

        jour = parJour;
        mois = parMois;
        annee = parAnnee;
        numberOfErrors += 1;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    public int getNumberOfErrors() {
        return numberOfErrors;
    }
}