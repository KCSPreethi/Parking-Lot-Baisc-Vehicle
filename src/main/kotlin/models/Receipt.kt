package models

import java.time.LocalDateTime

class Receipt(ticket: Ticket) {

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

    fun getReceiptNumber():Int{
        return receiptNumber
    }
    fun getParkingFee(): Long {
        return parkingFee
    }


}