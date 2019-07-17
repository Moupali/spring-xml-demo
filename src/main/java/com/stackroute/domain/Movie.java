package com.stackroute.domain;

public class Movie {

    //creating object of Actor
    Actor actor;

    //setter method for Actor
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public void acting()
    {
        actor.drama();
    }
}
