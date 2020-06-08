package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends HermesVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private String cameraType;
    private String sensorType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int sumOfHoursFromLastRepair, boolean readyToFly){
        this.cameraType = cameraType ;
        this.sensorType = sensorType ;
        this.pilotName = pilotName ;
        this.mission =  mission ;
        this.sumOfHoursFromLastRepair = sumOfHoursFromLastRepair ;
        this.readyToFly = readyToFly ;
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
