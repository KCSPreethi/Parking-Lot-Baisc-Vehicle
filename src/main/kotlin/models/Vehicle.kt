package models

import services.TicketDispenser
import java.time.Duration
import java.time.LocalDateTime

class Vehicle(private val vehicleNumber:Int) {
    //Ticket number
    //Receipt number
    //vehicle number
//    fun parkVehicle(): Ticket {
//        val slotNumber = slot.assignSlotToVehicle()
//        val ticket = Ticket(slotNumber)
//        //Call ticket dispenser
//        //return ticket
//        return ticket.generateTicketForVehicle()
//
//    }

//    fun unParkVehicle(ticket: Ticket): Receipt {
//        val exitTime = LocalDateTime.now()
//        slot.unBookSlot(ticket)
//        val receipt = Receipt(ticket)
//        val parkingFee = getDuration(ticket.getEntryTime(), exitTime) * 100
//        return receipt.generateReceiptDuringUnParking(exitTime, parkingFee)
//
//    }

    private fun getDuration(entryTime: LocalDateTime, exitTime: LocalDateTime): Long {
        val days = Duration.between(entryTime, exitTime).toDays()
        return (days * 24) + Duration.between(entryTime, exitTime).toHours()

    }

    fun park(slotNumber: Int): Ticket {
        val ticketDispenser = TicketDispenser()
        return ticketDispenser.getTicket(  slotNumber,this)

    }
    fun getVehicleNumber(): Int {
        return vehicleNumber
    }

}