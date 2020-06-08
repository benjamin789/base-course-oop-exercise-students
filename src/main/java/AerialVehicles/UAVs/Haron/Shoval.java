package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends HaronVehicle implements AerialBdaVehicle, AerialIntelligenceVehicle, AerialAttackVehicle {
    private int NUM_Missiles;
    private String missileType;
    private String sensorType;
    private String cameraType;

    public Shoval(String cameraType, int NUM_Missiles, String missileType, String sensorType, String pilotName, Mission mission, int sumOfHoursFromLastRepair, boolean readyToFly){
        this.NUM_Missiles = NUM_Missiles ;
        this.missileType = missileType ;
        this.sensorType = sensorType ;
        this.cameraType = cameraType ;
        this.pilotName = pilotName ;
        this.mission = mission ;
        this.sumOfHoursFromLastRepair = sumOfHoursFromLastRepair ;
        this.readyToFly = readyToFly ;
    }

    @Override
    public String attack() {
        return pilotName + ": " + this.getClass().getSimpleName() + " Attacking " + mission.toString() + " with: " + this.missileType ;

    }

    @Override
    public String preformBda() {
        return pilotName + ": " + this.getClass().getSimpleName() + "taking pictures of" + mission.toString() + "with: " + this.cameraType ;
    }

    @Override
    public String collectIntelligence() {
        return pilotName + ": " + this.getClass().getSimpleName() + " Collecting Data in " + mission.toString() + " with sensor type: " + sensorType ;
    }
}

