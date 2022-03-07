package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Races implements Comparable<Races>{
    protected Date date;
    protected String circuit;
    public static ArrayList<Races> allRaces=new ArrayList<>();
    public ArrayList<Teams> raceTeams=new ArrayList<>();
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
        Collections.sort(allRaces);
        for(Races r:allRaces){
            System.out.println(r.date.day+"."+r.date.month+"."+r.date.year+" " + r.circuit);
        }
    }
    public static void showRaceTeams(String name){
        for(Races r:allRaces){
            if(name.equals(r.circuit)){
                for(Teams t:r.raceTeams){
                    System.out.println(t.team);
                }
            }
        }
    }

    @Override
    public int compareTo(Races o) {
        if((date.month==o.date.month)){
            if(date.day<o.date.day){
                return -1;
            }
            else{
                return 1;
            }
        }
        else if(date.month>o.date.month){
            return 1;
        }
        else{
            return -1;
        }
    }
}
