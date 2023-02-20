package repository

import exceptions.VehicleTicketIncompatibleException
import models.Ticket

object TicketStore {

    private val allTickets = mutableMapOf<Int, Ticket>()

    fun getTicketWithVehicleNo(vehicleNumber: Int): Ticket {

        if (!allTickets.containsKey(vehicleNumber))
            throw VehicleTicketIncompatibleException("Vehicle number is not registered")

        return allTickets.getValue(vehicleNumber)
    }

    fun addTicketToRepo(vehicleNumber: Int, ticket: Ticket) {
        allTickets[vehicleNumber] = ticket
    }
}