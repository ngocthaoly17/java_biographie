package org.example;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class BiographieVCollection {

    private String name;
    private ArrayList <EvenementClef> listEvents;
    private TreeSet <EvenementClef> setEvents;
    private TreeMap<Integer,ArrayList <EvenementClef>> mapEvents;

    public BiographieVCollection(String parName) {
        this.name = parName;
        listEvents = new ArrayList<>();
        setEvents = new TreeSet<>();
        mapEvents = new TreeMap<>();
    }

    public void add(EvenementClef parEvent) {
        listEvents.add(parEvent);
        setEvents.add(parEvent);
        if (mapEvents.containsKey(parEvent.getDate().getYear())) {
            mapEvents.get(parEvent.getDate().getYear()).add(parEvent);
        }

        else {
            listEvents = new ArrayList<>();
            listEvents.add(parEvent);
            mapEvents.put(parEvent.getDate().getYear(), listEvents);
        }

        System.out.println(mapEvents);

    }

    public void remove(EvenementClef parEvent) {
        listEvents.remove(parEvent);
        setEvents.remove(parEvent);

        int year = parEvent.getDate().getYear();
        if (mapEvents.containsKey(year)) {
            mapEvents.get(year).remove(parEvent);
        }
        System.out.println(mapEvents);
    }

//    public String toString() {
//        return listEvents.size() + " " +  listEvents + "\n" + setEvents.size() + " " + setEvents.toString();
//
//    }


    public String toString() {

        Iterator <EvenementClef> iterateur = listEvents.iterator();
        while (iterateur.hasNext())
        {
            EvenementClef event = iterateur.next();
            System.out.println("- " + event);
        }
        return "";
    }

}
