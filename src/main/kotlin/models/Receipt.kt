package models

import java.time.LocalDateTime

var RECEIPT_NUMBER_TRACK = -1
class Receipt(ticket: Ticket) {

    private val slotNumber = ticket.getSlotNumber()
    private val entryTimeForVehicle = ticket.getEntryTime()
    private var receiptNumber: Int = ++RECEIPT_NUMBER_TRACK
    private var exitTime = LocalDateTime.now()
    private var parkingFee: Long = 0

    fun generateReceiptDuringUnParking(exitTime: LocalDateTime, parkingFee: Long): Receipt {
        this.exitTime = exitTime
        this.parkingFee = parkingFee
        return this
    }

    fun getReceiptNumber():Int{
        return receiptNumber
    }

    fun printReceipt() {
        println("Receipt Number $receiptNumber")
        println("Entry Time For Vehicle $entryTimeForVehicle")
        println("Exit Time for vehicle $exitTime")
        println("Parking Fee $parkingFee")
        println("Slot Number $slotNumber")
    }

    fun getExitTime(): LocalDateTime {
        return exitTime

    }


}