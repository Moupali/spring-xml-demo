package com.stackroute.domain;

public class Actor
{
    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String Name;
    String Gender;
    int age;

    public void drama(){
        System.out.println(Name+"is an Actor"+" and his age is "+age+"and gender is "+Gender);
    }
}
