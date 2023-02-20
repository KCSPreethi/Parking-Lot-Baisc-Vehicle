import models.SlotsSchedules
import models.Vehicle
import services.ParkingService

fun main(args: Array<String>) {

        val slot= SlotsSchedules(100)
        val slotNumber =  ParkingService().assignSlotToVehicle(slot)
        val vehicle=Vehicle(1290)
        val ticket = vehicle.park(slotNumber)

        ParkingService().unBookSlotForVehicle(slot,ticket)
        val receipt = vehicle.unPark(1290)






//        if(slotNumber!=-1)
//
//
//        val vehicle= Vehicle(slot)
//        val ticket = vehicle.parkVehicle()
//        val receipt =vehicle.unParkVehicle(ticket)
//        receipt.printReceipt()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}