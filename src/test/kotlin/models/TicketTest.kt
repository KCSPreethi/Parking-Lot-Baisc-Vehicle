package models

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TicketTest {


    @Test
    fun `add two tickets`() {
        val ticketOne = Ticket(1)
        val ticketTwo = Ticket(2)
        val ticketThree = Ticket(3)

        Assertions.assertEquals(0, ticketOne.getTicketNumber())
        Assertions.assertEquals(1, ticketTwo.getTicketNumber())
        Assertions.assertEquals(2, ticketThree.getTicketNumber())

    }
}