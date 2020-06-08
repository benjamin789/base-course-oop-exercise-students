package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends HaronVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {
    private int NUM_Missiles;
    private String missileType;
    private String sensorType;

    public Eitan(int NUM_Missiles, String missileType, String sensorType, String pilotName, Mission mission, int sumOfHoursFromLastRepair, boolean readyToFly){
        this.NUM_Missiles = NUM_Missiles ;
        this.missileType = missileType ;
        this.sensorType = sensorType ;
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
    public String collectIntelligence() {
        return pilotName + ": " + this.getClass().getSimpleName() + " Collecting Data in " + mission.toString() + " with sensor type: " + sensorType ;
    }
}
