package com.company;

public class PersonCreator implements IPerson{
    protected String name;
    protected String surname;
    protected int id;

    @Override
    public void setPerson(String name, String surname, int id) {
        this.name=name;
        this.surname=surname;
        this.id=id;
    }
    public void printPerson(){
        System.out.println(id+"-"+name+" "+surname);
    }
    @Override
    public String getName() {
        return (this.name);
    }

    @Override
    public String getSurname() {
        return (this.surname);
    }

    @Override
    public int getID() {
        return (this.id);
    }

}
