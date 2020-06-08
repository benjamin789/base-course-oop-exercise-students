package AerialVehicles.FighterJets;

import AerialVehicles.AerialVehicle;

public class FighterJetsVehicle extends AerialVehicle {
    private static final int FIGHTER_JETS_HOURS_LIMIT = 250 ;

    @Override
    public void check() {
        if (sumOfHoursFromLastRepair >= FIGHTER_JETS_HOURS_LIMIT) {
            repair();
        }
    }
}
