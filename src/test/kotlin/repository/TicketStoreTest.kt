package repository

import models.Ticket
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TicketStoreTest {

    @Test
    fun `add and check the availabilty of vehicle`() {
        val ticket = Ticket(1)
        TicketStore.addTicketToRepo(1002, ticket)
        val ticketPredicted = TicketStore.getTicketWithVehicleNo(1002)

        assertEquals(0, ticketPredicted.getTicketNumber())

    }

    @Test
    fun `add two vehicles and check`() {
        val ticket = Ticket(1)
        TicketStore.addTicketToRepo(1002, ticket)

        val ticketOne = Ticket(2)
        TicketStore.addTicketToRepo(1002, ticket)
        TicketStore.addTicketToRepo(1003, ticketOne)
        val ticketPredicted = TicketStore.getTicketWithVehicleNo(1002)
        val ticketPredictedOne = TicketStore.getTicketWithVehicleNo(1003)

        assertEquals(0, ticketPredicted.getTicketNumber())
        assertEquals(1, ticketPredictedOne.getTicketNumber())
    }
}