package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends HermesVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle, AerialBdaVehicle {
    private int NUM_Missiles;
    private String missileType;
    private String sensorType;
    private String cameraType;

    public Kochav(int NUM_Missiles, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int sumOfHoursFromLastRepair, boolean readyToFly){
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
        return pilotName + ": " + this.getClass().getSimpleName() + " Attacking " + mission.toString() + " with: " + this.missileType + "X" + NUM_Missiles;
    }

    @Override
    public String preformBda() {
        return pilotName + ": " + this.getClass().getSimpleName() + " taking pictures of " + mission.toString() + " with: " + this.cameraType + " camera" ;
    }

    @Override
    public String collectIntelligence() {
        return pilotName + ": " + this.getClass().getSimpleName() + " Collecting Data in " + mission.toString() + " with sensor type: " + sensorType ;
    }
}
