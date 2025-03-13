package org.example;

public class Date_V2 implements Comparable <Date> {

    /**
     * Classe Date
     * @author isabelle robba
     * @version 1.0
     */

    /**
     *  le champ privé jour de type int
     */
    private int jour;

    /**
     *  le champ privé mois de type int
     */
    private int mois;

    /**
     *  le champ privé annee de type int
     */
    private int annee;

    /**
     * Contructeur qui instancie une date avec les paramètres parJour parMois et parAnnee à condition qu'ils forment une date valide
     * sinon les 3 champs jour, mois et annee restent à 0
     *
     * @param  parJour pour le champ jour
     * @param  parMois pour le champ mois
     * @param  parAnnee pour le champ annee
     */
    public Date_V2 (int parJour, int parMois, int parAnnee) throws ExceptionDate {

        if ( 1583 <= parAnnee &&
                1 <= parMois && parMois <= 12 &&
                1 <= parJour && parJour <= Date_V2.lastDayOfTheMonth(parMois, parAnnee)) {
            jour = parJour;
            mois = parMois;
            annee = parAnnee;
        }

//        if (parAnnee < 1583)
//            throw new ExceptionDate("erreur detecte : l'annee est antérieur à la date autorisé", parJour, parMois, parAnnee);
//        if (parMois < 1 || 12 < parMois)
//            throw new ExceptionDate("erreur detecte : mois inccorrecte", parJour, parMois, parAnnee);
//        if (parJour < 1 || Date_V2.lastDayOfTheMonth(parMois, parAnnee) < parJour)
//            throw new ExceptionDate("erreur detecte : jour incorrecte", parJour, parMois, parAnnee);


        else {
            throw new ExceptionDate("Date incorrecte", parJour, parMois, parAnnee);
        }
        //sinon jour, mois et annee valent 0
    }





    /**
     * Contructeur qui instancie une date au premier janvier de l'année reçue en paramètre
     *
     * @param  parAnnee pour le champ annee
     */
    public Date_V2 (int parAnnee) {

        jour = 1;
        mois = 1;
        annee = parAnnee;
    }

    /**
     * isLeapYear retourne true si parAnnee est une année bissextile, elle retourne false dans le cas contraire
     *
     * @param  parAnnee l'année testée
     * @return boolean
     *
     */
    public static boolean isLeapYear(int parAnnee) {

        return parAnnee % 400 == 0 || (parAnnee % 100 != 0  && parAnnee % 4 == 0);
    }

    /**
     * lastDayOfTheMonth retourne le dernier jour du mois reçu en paramètre (28, 29, 30 ou 31),
     * pour le mois de février (2) l'année reçue en paramètre est utilisée pour savoir si le dernier jour est 28 ou 29
     *
     * @param parMois
     * @param parAnnee
     * @return int
     */
    public static int lastDayOfTheMonth (int parMois, int parAnnee) {

        switch (parMois) {
            case 2 :
                if (Date_V2.isLeapYear(parAnnee))
                    return 29;
                else return 28 ;
            case 4 : case 6 : case 9 : case 11 :
                return 30;
            default: return 31;

        }
    }

    /**
     * compareTo retourne
     *  - un entier négatif si this (l'objet appelant) est une date antérieure au paramètre
     *  - un entier positif si this (l'objet appelant) est une date postérieure au paramètre
     *  - 0 si this et le paramètre sont les mêmes dates
     *
     * @param parDate la date comparée à this
     * @return int
     *
     */
    public int compareTo (Date_V2 parDate) {
        if (this.annee < parDate.annee)
            return -7;
        if (this.annee > parDate.annee)
            return 7;
        if (this.mois < parDate.mois)
            return -5;
        if (this.mois > parDate.mois)
            return 5;
        if (this.jour < parDate.jour)
            return -3;
        if (this.jour > parDate.jour)
            return 3;
        return 0;
    }

    /**
     * nextDay retourne la date du lendemain de l'objet appelant
     *
     * @return Date
     */
    public Date_V2 nextDay () throws ExceptionDate {
        if (jour < Date_V2.lastDayOfTheMonth(mois,annee))
            return new Date_V2 (jour+1,mois,annee);
        if (mois < 12)
            return  new Date_V2 (1,mois+1,annee);
        return  new Date_V2 (1,1,annee+1);
    }

    /**
     * dayBefore retourne la date de la veille de l'objet appelant
     *
     * @return Date
     */
    public Date_V2 dayBefore () throws ExceptionDate {
        if (jour > 1)
            return  new Date_V2 (jour-1,mois,annee);
        if (mois > 1)
            return new Date_V2 (Date_V2.lastDayOfTheMonth(mois-1, annee),mois-1,annee);
        return new Date_V2 (31,12,annee-1);
    }

    /**
     * toString retourne une chaine de caractères contenant les 3 champs de l'objet appelant
     * le nom du mois est utilisé plutôt que son numéro
     * @return String
     */
    public String toString () {
        // v1
        // return jour + "-" + mois + "-" + annee;

        String [] MOIS = {"janvier","février","mars","avril","mai","juin", "juillet","août","septembre", "octobre", "novembre", "décembre"};
        return jour + " " + MOIS [mois-1] + " " + annee;
    }

    public int getYear() {
        return annee;
    }

    @Override
    public int compareTo(Date o) {
        return 0;
    }
}
