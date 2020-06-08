package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJetsVehicle implements AerialAttackVehicle, AerialBdaVehicle {
    private int NUM_Missiles;
    private String missileType;
    private String cameraType;

    public F16(String cameraType, int NUM_Missiles, String missileType, String pilotName, Mission mission, int sumOfHoursFromLastRepair, boolean readyToFly){
        this.cameraType = cameraType ;
        this.NUM_Missiles = NUM_Missiles ;
        this.missileType = missileType ;
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
}
