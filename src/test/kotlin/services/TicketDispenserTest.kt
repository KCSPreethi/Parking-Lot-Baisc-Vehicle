package services

import models.Vehicle
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TicketDispenserTest {
    @Test
    fun `one two`() {

        val ticketDispenser = TicketDispenser()
        val vehicle = Vehicle(1001)
        val ticket = ticketDispenser.getTicket(1, vehicle)

        assertEquals(0, ticket.getTicketNumber())
        assertEquals(1, ticket.getSlotNumber())

    }


}