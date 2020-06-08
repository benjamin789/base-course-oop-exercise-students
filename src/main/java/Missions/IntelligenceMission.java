package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission implements  MissionService{
    String region;
    public IntelligenceMission(String region, Coordinates coordinates){
        this.region = region ;
        this.coordinates = new Coordinates(coordinates) ;
    }

    @Override
    public String toString() {
        return "Collecting Data in " + region;
    }
}
