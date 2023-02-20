package services

import models.Ticket
import models.Vehicle
import repository.TicketStore

class TicketDispenser {
    fun getTicket(slotNumber: Int , vehicle: Vehicle): Ticket {
        val ticket = Ticket(slotNumber).generateTicketForVehicle()
        TicketStore.addTicketToRepo(vehicle.getVehicleNumber(), ticket)
        return  ticket
    }


}