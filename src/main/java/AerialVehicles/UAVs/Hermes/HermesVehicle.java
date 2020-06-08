package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialVehicle;

public class HermesVehicle extends AerialVehicle {
    private static final int HERMES_HOURS_LIMIT = 100 ;


    @Override
    public void check() {
        if (sumOfHoursFromLastRepair >= HERMES_HOURS_LIMIT) {
            repair();
        }
    }
}
