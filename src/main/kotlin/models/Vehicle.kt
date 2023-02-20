package models

import services.ReceiptDispenser
import services.TicketDispenser
import java.time.Duration
import java.time.LocalDateTime

class Vehicle(private val vehicleNumber:Int) {
    private var ticketNumber: Int? = null
    private var receiptNumber : Int? =null

    fun setTicketNumber(ticketNo:Int){
        ticketNumber=ticketNo
    }

    fun setReceiptNumber(receiptNo:Int){
        receiptNumber=receiptNo
    }
    fun park(slotNumber: Int): Ticket {
        val ticketDispenser = TicketDispenser()
        return ticketDispenser.getTicket(  slotNumber,this)

    }
    fun getVehicleNumber(): Int {
        return vehicleNumber
    }

    fun unPark(vehicleNumber: Int): Receipt {
        val receiptDispenser = ReceiptDispenser()
        return receiptDispenser.getReceipt(this)

    }

}