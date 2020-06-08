package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialVehicle;

public class HaronVehicle extends AerialVehicle {
    private static final int HARON_HOURS_LIMIT = 150 ;
    @Override
    public void check() {
        if (sumOfHoursFromLastRepair >= HARON_HOURS_LIMIT) {
            repair();
        }
    }
}
