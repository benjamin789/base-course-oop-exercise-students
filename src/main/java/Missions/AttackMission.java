package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission implements  MissionService{

    String target;
    public AttackMission(String target, Coordinates coordinates){
        this.target = target ;
        this.coordinates = new Coordinates(coordinates) ;
    }
    public String toString(){
        return "Attacking " + target;
    }
}
