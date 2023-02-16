package models

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class SlotTest{
    @Test
    fun `To allot slot to vehicle coming`(){
        val slot = Slot(100)
        var slotNumber = slot.assignSlotToVehicle()
        slotNumber=slot.assignSlotToVehicle()

        assertEquals(2,slotNumber)
        assertEquals(true,slot.isSlotNumberParked(slotNumber))
    }

    @Test
    fun `To unBook slot when we unPark vehicle`() {
        val slot = Slot(100)
        var slotNumber = slot.assignSlotToVehicle()
        val ticket=Ticket(slotNumber)
        slot.unBookSlot(ticket)
        assertEquals(false,slot.isSlotNumberParked(slotNumber))

    }

}