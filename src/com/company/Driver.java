package com.company;

import java.util.ArrayList;

public class Driver extends PersonCreator {
    public static ArrayList<Driver> allDrivers=new ArrayList<>();
    Driver(String name, String surname, int id){
    super.setPerson(name,surname,id);
    allDrivers.add(this);
    }
    static void checkDriverList(String name ){
        int flag=0;
        for(Driver d:allDrivers){
            if(d.name.equals(name)){
               flag=1;
               allDrivers.remove(d);
                break;
            }
        }
        if(flag==0){
            System.out.println("The Driver is not present on the list");
        }
    }
    static void printAllDrivers(){
        for(Driver d:allDrivers){
            System.out.println(d.getID()+ "-"+ d.getName() + " " + d.getSurname());
        }
    }
    static boolean checkId(int id){
        boolean flag=true;
        for(Driver d:allDrivers){
            if(id==d.id) {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
