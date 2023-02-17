package models

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class VehicleTest{

    @BeforeEach
    fun `clear all vehicle history`()
    {


    }

    @Test
    fun `generate ticket and slot number when vehicle comes to park`() {
        //Arrange
        val vehicle: Vehicle = Vehicle()
        //Act
        val ticket: Ticket = vehicle.parkVehicle()
        //Assert
        assertEquals(ticket.getTicketNumber(),0)
        assertEquals(ticket.getSlotNumber(),1)

    }

    @Test
    fun `generate receipt when unParking vehicle`() {
        //Arrange
        val vehicle: Vehicle = Vehicle()
        //Act
        val ticket: Ticket = vehicle.parkVehicle()
        val receipt: Receipt = vehicle.unParkVehicle(ticket)

        //Assert
        assertEquals(receipt.getReceiptNumber(),0)
        assertEquals(receipt.getParkingFee(),0)

    }


}