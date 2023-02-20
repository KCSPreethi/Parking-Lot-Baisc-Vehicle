package models

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ReceiptTest {
    @Test
    fun `Add two receipts`() {
        val ticketOne = Ticket(1)
        val ticketTwo = Ticket(2)
        val receiptOne = Receipt(ticketOne)
        val receiptTwo = Receipt(ticketTwo)

        Assertions.assertEquals(0, receiptOne.getReceiptNumber())
        Assertions.assertEquals(1, receiptTwo.getReceiptNumber())

    }
}