package com.stackroute.domain;

public class Actor
{
    private String Name;
    private String Gender;
    private int age;

    public Actor(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        this.age = age;
    }

    public void drama(){
        System.out.println(Name+"is an Actor"+" and his age is "+age+"and gender is "+Gender);
    }




    /*public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }*/




}
