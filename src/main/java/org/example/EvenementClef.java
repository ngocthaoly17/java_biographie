package org.example;

public class EvenementClef implements Comparable <EvenementClef> {

    private Date date;
    private String intituleEvenement;

    public EvenementClef(Date parDate, String parintituleEvenement) {
        this.date = parDate;
        this.intituleEvenement = parintituleEvenement;
    }


    public String toString() {
        return this.date + ", " + "Evenement: " + intituleEvenement;
    }

    /**
     * la methode compare to retourne un entier négatif quand la date de this est antiere a la date du parametre
     *
     * @param event the object to be compared.
     * @return
     */

    @Override
    public int compareTo(EvenementClef event) {
        int dateComparison = this.date.compareTo(event.date);
        if (dateComparison == 0) {
            return this.intituleEvenement.compareTo(event.intituleEvenement);
        }
        return dateComparison;
    }

    @Override
    public boolean equals (Object parEvent) {
        EvenementClef evenementClef = (EvenementClef) parEvent;
        return this.date.compareTo(evenementClef.date) == 0;
    }

    public Date getDate() {
        return this.date;
    }

}


