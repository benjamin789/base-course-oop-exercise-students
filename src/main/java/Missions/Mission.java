package Missions;


import Entities.Coordinates;

public abstract class Mission{
    public Coordinates coordinates;

    public abstract String toString();

    public void begin(){
        System.out.println("Beginning Mission!");
    }

    public void cancel(){
        System.out.println("Aborting Mission!");
    }

    public void finish(){
        System.out.println("Finish Mission!");
    }
}
