package models

class SlotsSchedules(private var totalSpots: Int) {
    private var slotSchedule : MutableList<Boolean> = MutableList(totalSpots+1){false}
    private var slotsAvailable: Int = totalSpots

    fun assignSlotToVehicle():Int{
        if(!isSlotFreeToPark())
        {
            for(slot in 1..totalSpots)
            {
                if(!isSlotNumberParked(slot)) {
                    bookSlotForTheVehicle(slot)
                    return slot
                }
            }
            slotsAvailable--
        }

        return -1
    }
    fun isSlotNumberParked(slotNumber:Int): Boolean
    {
        return slotSchedule[slotNumber]
    }
    private fun isSlotFreeToPark(): Boolean {
        return slotsAvailable<0

    }
    fun unBookSlot(ticket: Ticket) {
        slotSchedule[ticket.getSlotNumber()] = false
        slotsAvailable++
    }

    private fun bookSlotForTheVehicle(slot: Int) {
            slotSchedule[slot]=true
    }

}