package services

import exceptions.ParkingNotAvailable
import models.SlotsSchedules
import models.Ticket

class ParkingService {

    fun assignSlotToVehicle(slotsSchedules: SlotsSchedules): Int {
        return slotsSchedules.assignSlotToVehicle()
    }

    fun unBookSlotForVehicle(slot: SlotsSchedules, ticket: Ticket) {
        slot.unBookSlot(ticket)
    }

}
