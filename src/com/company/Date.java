package com.company;

public class Date{
    protected int day,month,year;
    Date(int d, int m)throws Exception{
        if((d>=1&&d<=31)&&(m>=1&&m<=12)){
            day = d;
            month=m;
            year=2022;
        }
        else{
            throw new Exception();
        }



    }
    public void printDate(){
        System.out.println(day + "." + month+"."+year);
    }
    public int compareDates(Date d1, Date d2){
        if(d1.year==d2.year && d1.month== d2.month && (Math.abs(d1.day-d2.day))<=7){
            return 0;
        }
        else
            return 1;
    }
}
