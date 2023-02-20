package services

import exceptions.ParkingNotAvailable
import models.SlotsSchedules

class ParkingService {

    fun assignSlotToVehicle(slotsSchedules: SlotsSchedules): Int {
        return slotsSchedules.assignSlotToVehicle()
    }

}
