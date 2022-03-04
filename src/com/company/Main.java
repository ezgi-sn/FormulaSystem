package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Teams ferrari = new Teams("Ferrari",1);
        Teams mcLaren = new Teams("McLaren",2);
        Teams mercedes = new Teams("Mercedes",3);
        Teams redBull = new Teams("Red Bull",4);
        Teams alphaTauri = new Teams("Alpha Tauri",5);
        Teams alphaRomeo = new Teams("Alpha Romeo",6);
        Teams astonMartin = new Teams("Aston Martin",7);
        Teams haas = new Teams("Haas",8);

        System.out.println("1-Log in as Admin");
        System.out.println("2-Log in as User");
        System.out.println("3-Close the Program");
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter your choice");

            int selection;
            selection=scanner.nextInt();
            if(selection==1) {
                System.out.println("Enter Password");
                scanner.nextLine();
                String password=scanner.nextLine();
                if(password.equals("password")){
                    System.out.println("1-Driver Menu 2-Team Menu 3-Race Menu 4-Close the Program");
                    selection=scanner.nextInt();
                    if(selection==4){
                        break;
                    }
                    else if(selection==1){
                        System.out.println("1-Add 2-Remove");
                        selection=scanner.nextInt();
                        if(selection==1){
                        String name,surname;
                        int id;
                        scanner.nextLine();
                        System.out.println("Name of the driver");
                        name=scanner.nextLine();
                        System.out.println("Surname of the driver");
                        surname=scanner.nextLine();
                        System.out.println("ID of the driver");
                        id=scanner.nextInt();
                            for(Driver d:Driver.allDrivers){
                                if(d.id==id){
                                    System.out.println("The ID has already taken, Try another ID");
                                    System.out.println("ID of the driver");
                                    id=scanner.nextInt();
                                }
                            }

                        Driver driver=new Driver(name,surname,id);
                        System.out.println("Do you want to continue? (y/n)");
                        String s=scanner.next();
                        if(s.equals("n")){
                            break;
                        }
                        }
                        else if(selection==2){
                            scanner.nextLine();
                            Driver.printAllDrivers();
                            System.out.println("Name of the driver you want to delete");
                            String name=scanner.nextLine();
                            Driver.checkDriverList(name);
                            System.out.println("Driver list after deletion");
                            Driver.printAllDrivers();
                            System.out.println("Do you want to continue? (y/n)");
                            String s=scanner.next();
                            if(s.equals("n")){
                                break;
                            }
                        }

                        else{
                            System.out.println("Invalid input");
                        }
                    }
                    else if(selection==2){
                        System.out.println("Enter your choice");
                        System.out.println("1-Ferrari 2-McLaren 3-Mercedes 4-Red Bull 5-Alpha Tauri 6-Alpha Romeo 7-Aston Martin 8-Haas");
                        int choice=scanner.nextInt();
                        for(Teams t:Teams.allTeams){
                            if(choice==t.id){
                                System.out.println("1-Add a Racer to the Team 2-Join a Race 3-Withdraw from Tournament");
                                selection=scanner.nextInt();
                                if(selection==1){
                                Driver.printAllDrivers();
                                    System.out.println("Name of the driver you want to transfer");
                                    scanner.nextLine();
                                    String name=scanner.nextLine();
                                    t.addTeamList(name);
                                    System.out.println("Drivers of the team "+t.team);
                                    t.showDrivers(t);
                                }
                                else if(selection==2){
                                    System.out.println("Name of the Circuit You Want To Join");
                                    Races.showAllRaces();
                                    scanner.nextLine();
                                    String name=scanner.nextLine();
                                    Races.joinRace(t,name);
                                    System.out.println("Do you want to continue? (y/n)");
                                    String s=scanner.next();
                                    if(s.equals("n")){
                                        break;
                                    }

                                }
                                else if(selection==3){

                                }
                                else{

                                }
                            }
                        }

                    }
                    else if(selection==3){
                        System.out.println("Add a Race to the Calendar");
                        int day,month;
                        System.out.println("Day of the race");
                        day=scanner.nextInt();
                        System.out.println("Month of the race");
                        month=scanner.nextInt();
                        try{
                        Date d=new Date(day,month);
                            System.out.println("Name of the Circuit");
                            scanner.nextLine();
                            String circ=scanner.nextLine();
                            Races r=new Races(d,circ);

                        }
                        catch (Exception e){
                            System.out.println("Date is invalid");
                        }

                    }
                }
                else{
                    System.out.println("Password is not correct");
                    break;
                }
            }
            else if(selection==2){
                System.out.println("1-Show All Drivers 2- Show All Teams 3-Show Race Schedule");
            }
            else if(selection==3){
                break;
            }
            else{
                System.out.println("Invalid input");
                System.out.println("1-Log in as Admin");
                System.out.println("2-Log in as User");
                System.out.println("3-Close the Program");


            }
        }
    }

}
