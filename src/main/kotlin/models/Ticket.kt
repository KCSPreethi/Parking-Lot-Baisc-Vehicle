package models

import java.time.LocalDateTime


class Ticket(private var slotParkingId: Int) {

    private var entryTimeDuringPark: LocalDateTime = LocalDateTime.now()
    private var ticketNumber: Int = generateTicketNumber()

    fun getEntryTime(): LocalDateTime {
        return entryTimeDuringPark
    }

    private fun generateTicketNumber(): Int {
        return ticketNumber++
    }

    fun generateTicketForVehicle(): Ticket {
        return this
    }

    fun getSlotNumber(): Int {
        return slotParkingId
    }

    fun getTicketNumber():Int{
        return ticketNumber
    }

}