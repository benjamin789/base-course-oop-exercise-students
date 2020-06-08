package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService{
    protected String pilotName;
    protected Mission mission;
    protected int sumOfHoursFromLastRepair;
    protected boolean readyToFly;

    @Override
    public void flyTo() {
        System.out.println("Flying to: "+ mission.coordinates.getLatitude() + ", " + mission.coordinates.getLatitude());
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }

    public abstract void check();

    @Override
    public void repair() {
        readyToFly = true ;
        sumOfHoursFromLastRepair = 0 ;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public void setHoursOfFlightSinceLastRepair(int hours){
        sumOfHoursFromLastRepair = hours ;
    }

    public int getHoursOfFlightSinceLastRepair(){
        return sumOfHoursFromLastRepair ;
    }
}
