package com.company;

import java.util.ArrayList;

public class Races {
    protected Date date;
    protected String circuit;
    public static ArrayList<Races> allRaces=new ArrayList<>();
    public static ArrayList<Teams> raceTeams=new ArrayList<>();
    Races(Date d,String place){
        date=d;
        circuit=place;
        allRaces.add(this);
    }
    public static void joinRace(Teams t,String name){
        for(Races r:allRaces){
            if(name.equals(r.circuit)){
                r.raceTeams.add(t);
            }
        }
    }
    public static void showAllRaces(){
        for(Races r:allRaces){
            System.out.println(r.date.day+"."+r.date.month+"."+r.date.year+" " + r.circuit);
        }
    }
}
