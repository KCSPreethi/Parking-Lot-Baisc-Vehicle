package repository

import models.Ticket

object TicketStore {

    private val allTickets = mutableMapOf<Int, Ticket>()

    fun getTicketWithVehicleNo(vehicleNumber: Int): Ticket? {

        if (!allTickets.containsKey(vehicleNumber))
            return null

        return allTickets.getValue(vehicleNumber)
    }

    fun addTicketToRepo(vehicleNumber: Int, ticket: Ticket) {
        allTickets[vehicleNumber] = ticket
    }
}