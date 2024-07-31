package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.BulldozerProducerImpl;
import core.mate.academy.service.ExcavatorProducerImpl;
import core.mate.academy.service.MachineServiceImpl;
import core.mate.academy.service.TruckProducerImpl;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Bulldozer[] bulldozers = new Bulldozer[] {
                new Bulldozer("Buldozer1", "Green", 2),
                new Bulldozer("Buldozer2", "White", 2),
                new Bulldozer("Buldozer3", "Black", 3)
        };
        Truck[] trucks = new Truck[] {
                new Truck("Truck1", "Yellow", 100),
                new Truck("Truck2", "Blue", 150),
                new Truck("Truck3", "Red", 200)
        };
        Excavator[] excavators = new Excavator[] {
                new Excavator("Excavator1", "Red", 4),
                new Excavator("Excavator2", "White", 3),
                new Excavator("Excavator3", "Black", 5)
        };

        BulldozerProducerImpl bulldozerProducer = new BulldozerProducerImpl();
        bulldozerProducer.addBulldozerToList(bulldozers);

        TruckProducerImpl truckProducer = new TruckProducerImpl();
        truckProducer.addTruckToList(trucks);
        ExcavatorProducerImpl excavatorProducer = new ExcavatorProducerImpl();
        excavatorProducer.addExcavatorToList(excavators);

        MachineServiceImpl machineService = new MachineServiceImpl(bulldozerProducer,
                excavatorProducer, truckProducer);

        List<Machine> bulldozerMachine = machineService.getAll(Bulldozer.class);
        System.out.println(bulldozerMachine);

        List<Machine> truckMachine = machineService.getAll(Truck.class);
        System.out.println(truckMachine);

        List<Machine> excavatorMachine = machineService.getAll(Excavator.class);
        System.out.println(excavatorMachine);
    }
}
