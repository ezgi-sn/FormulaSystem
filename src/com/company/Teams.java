package com.company;

import java.util.ArrayList;

public class Teams {
    protected String team;
    protected int id;
    public ArrayList<Driver> driversOfTeams=new ArrayList<Driver>();
    public static ArrayList<Teams> allTeams=new ArrayList<Teams>();
    Teams(String team,int id){
        this.team=team;
        this.id=id;
        allTeams.add(this);
    }
    public int checkDriverList(String name){
        int flag=0;
        for(Teams t:allTeams){
            for(Driver driver:t.driversOfTeams){
                if(driver.name.equals(name)){
                   flag=1;
                   break;
                }
            }
        }
        return flag;
    }
    public void addTeamList(String name){
      if(checkDriverList(name)==0) {
          for (Driver d : Driver.allDrivers) {
              if (d.name.equals(name)) {
                  driversOfTeams.add(d);
                  break;
              }
          }
      }
      else
          System.out.println("The Driver has already in a team");
    }
    public void showDrivers(Teams t){
        System.out.println("Drivers of the team "+t.team);
     for(Driver d:t.driversOfTeams){
         System.out.println(d.id + "- " + d.name + " "+ d.surname);
     }
    }
    public static void printAllTeams(){
        for(Teams t:allTeams){
            System.out.println(t.team);
        }
    }
    public void withdraw(Teams t){
        int len=t.driversOfTeams.size();
        for(int i=len-1; i>=0;i--){
            t.driversOfTeams.remove(i);
        }
        for(Races r:Races.allRaces){
            for(Teams team:r.raceTeams){
                if(team.team.equals(t.team)){
                    r.raceTeams.remove(t);
                    break;
                }
            }
        }
    }
}

