package com.stackroute.domain;

public class Actor
{
     String Name;
      String Gender;
      int age;
    
    //Getter Setter method created
    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
  
    public void drama(){
        System.out.println(Name+"is an Actor"+" and his age is "+age+"and gender is "+Gender);
    }
}
