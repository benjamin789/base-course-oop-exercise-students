package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission implements  MissionService{
    String objective;
    public BdaMission(String objective, Coordinates coordinates){
        this.objective = objective ;
        this.coordinates = new Coordinates(coordinates) ;
    }

    @Override
    public String toString() {
        return objective ;
    }
}
