package models

import java.time.LocalDateTime

class Receipt(ticket: Ticket) {
    private val slotNumber = ticket.getSlotNumber()
    private val entryTimeForVehicle = ticket.getEntryTime()
    private var receiptNumber: Int = generateReceiptNumber()
    private var exitTime = LocalDateTime.now()
    private var parkingFee: Long = 0
    private fun generateReceiptNumber(): Int {
        return receiptNumber++
    }

    fun generateReceiptDuringUnParking(exitTime: LocalDateTime, parkingFee: Long): Receipt {
        this.exitTime = exitTime
        this.parkingFee = parkingFee
        return this
    }

    fun getReceiptNumber(): Int {
        return receiptNumber
    }

    fun getParkingFee(): Long {
        return parkingFee
    }
    fun printReceipt() {
        println("Receipt Number $receiptNumber")
        println("Entry Time For Vehicle $entryTimeForVehicle")
        println("Exit Time for vehicle $exitTime")
        println("Parking Fee $parkingFee")
        println("Slot Number $slotNumber")
    }


}