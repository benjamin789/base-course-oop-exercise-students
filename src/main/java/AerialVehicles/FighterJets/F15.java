package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.Mission;

public class F15 extends FighterJetsVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {

    private int NUM_Missiles;
    private String missileType;
    private String sensorType;

    public F15(String sensorType, int NUM_Missiles, String missileType, String pilotName, Mission mission, int sumOfHoursFromLastRepair, boolean readyToFly){
        this.sensorType = sensorType ;
        this.NUM_Missiles = NUM_Missiles ;
        this.missileType = missileType ;
        this.pilotName = pilotName ;
        this.mission = mission ;
        this.sumOfHoursFromLastRepair = sumOfHoursFromLastRepair ;
        this.readyToFly = readyToFly ;
    }


    @Override
    public String attack() {
        return pilotName + ": " + this.getClass().getSimpleName() + " Attacking " + mission.toString() + " with: " + missileType + "X" + NUM_Missiles;
    }

    @Override
    public String collectIntelligence() {
        return pilotName + ": " + this.getClass().getSimpleName() + " Collecting Data in " + mission.toString() + " with sensor type: " + sensorType ;
    }
}
