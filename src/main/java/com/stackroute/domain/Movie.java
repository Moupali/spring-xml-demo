package com.stackroute.domain;

public class Movie {

    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public void setActor(Actor actor) {
        this.actor = actor;
   }
    public void acting()
    {
        actor.drama();
    }
}
