package models

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import services.ParkingService

class VehicleTest {

//


    @Test
    fun `add two vehicles and check the details`() {
        val slot = SlotsSchedules(100)
        val vehicle = Vehicle(1201)
        val ticket = vehicle.park(ParkingService().assignSlotToVehicle(slot))

        assertEquals(0, ticket.getTicketNumber())
        assertEquals(1, ticket.getSlotNumber())

    }

    @Test
    fun `generate ticket and slot number when vehicle comes to park`() {
        //Arrange
        val slot = SlotsSchedules(100)
        val vehicle: Vehicle = Vehicle(1002)

        //Act
        val slotNumber = ParkingService().assignSlotToVehicle(slot)
        val ticket: Ticket = vehicle.park(slotNumber)
        //Assert
        assertEquals(ticket.getTicketNumber(), 0)
        assertEquals(ticket.getSlotNumber(), 1)

    }


}