package com.stackroute.domain;

public class Actor
{
    private String Name;
    private String Gender;
    private int age;

    public Actor() {
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Actor(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        this.age = age;
    }

   public String toString()
   {
       return "name ="+Name+"  gender="+Gender+ "  age ="+age;
   }







}
