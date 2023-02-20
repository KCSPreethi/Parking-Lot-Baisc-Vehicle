package services

import models.Receipt
import models.Vehicle
import repository.TicketStore
import java.time.Duration
import java.time.LocalDateTime

class ReceiptDispenser {
    fun getReceipt(vehicle: Vehicle): Receipt {
        val ticket = TicketStore.getTicketWithVehicleNo(vehicle.getVehicleNumber())
        val receipt = Receipt(ticket)
        val parkingFee = getDuration(ticket.getEntryTime(), receipt.getExitTime())
        vehicle.setReceiptNumber(receipt.getReceiptNumber())
        return receipt.generateReceiptDuringUnParking(receipt.getExitTime(), parkingFee)
    }

    private fun getDuration(entryTime: LocalDateTime, exitTime: LocalDateTime): Long {
        val days = Duration.between(entryTime, exitTime).toDays()
        return (days * 24) + Duration.between(entryTime, exitTime).toHours()
    }
}