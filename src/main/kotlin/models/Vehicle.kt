package models

import java.time.Duration
import java.time.LocalDateTime

class Vehicle(private val slot: SlotsSchedules) {
    //Ticket number
    //Receipt number
    //vehicle number
    fun parkVehicle(): Ticket {
        val slotNumber = slot.assignSlotToVehicle()
        val ticket = Ticket(slotNumber)
        //Call ticket dispenser
        //return ticket
        return ticket.generateTicketForVehicle()

    }

    fun unParkVehicle(ticket: Ticket): Receipt {
        val exitTime = LocalDateTime.now()
        slot.unBookSlot(ticket)
        val receipt = Receipt(ticket)
        val parkingFee = getDuration(ticket.getEntryTime(), exitTime) * 100
        return receipt.generateReceiptDuringUnParking(exitTime, parkingFee)

    }

    private fun getDuration(entryTime: LocalDateTime, exitTime: LocalDateTime): Long {
        val days = Duration.between(entryTime, exitTime).toDays()
        return (days * 24) + Duration.between(entryTime, exitTime).toHours()

    }

}