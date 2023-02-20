package models

import java.time.LocalDateTime

var TICKET_NUMBER = -1
class Ticket(private var slotParkingId: Int) {

    private var entryTimeDuringPark: LocalDateTime = LocalDateTime.now()
    private var ticketNumber: Int =  ++TICKET_NUMBER

    //Ticket Dispenser model
    fun getEntryTime(): LocalDateTime {
        return entryTimeDuringPark
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