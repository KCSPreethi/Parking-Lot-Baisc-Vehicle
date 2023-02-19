package models

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SlotTest {
    @Test
    fun `To allot slot to vehicle coming`() {
        val slot = SlotsSchedules(100)
        val slotNumberOne = slot.assignSlotToVehicle()
        val slotNumberTwo = slot.assignSlotToVehicle()

        assertEquals(1, slotNumberOne)
        assertEquals(2, slotNumberTwo)
        assertEquals(true, slot.isSlotNumberParked(slotNumberTwo))
    }

    @Test
    fun `To unBook slot when we unpark vehicle`() {
        val slot = SlotsSchedules(100)
        val slotNumber = slot.assignSlotToVehicle()
        val ticket = Ticket(slotNumber)
        slot.unBookSlot(ticket)
        assertEquals(false, slot.isSlotNumberParked(slotNumber))

    }

    @Test
    fun `To check multiple vehicles availability`() {
        val slot = SlotsSchedules(100)
        val slotNumberOne = slot.assignSlotToVehicle()
        val slotNumberTwo = slot.assignSlotToVehicle()


        val ticketOne = Ticket(slotNumberOne)
        val ticketTwo = Ticket(slotNumberTwo)
        slot.unBookSlot(ticketOne)

        assertEquals(true, slot.isSlotNumberParked(slotNumberTwo))
        assertEquals(2, ticketTwo.getSlotNumber())
        assertEquals(1, ticketOne.getSlotNumber())
        assertEquals(false, slot.isSlotNumberParked(slotNumberOne))
    }

}