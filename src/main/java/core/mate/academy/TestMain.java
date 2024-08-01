package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineServiceImpl;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        MachineServiceImpl machineService = new MachineServiceImpl();

        List<Machine> bulldozerMachine = machineService.getAll(Bulldozer.class);
        System.out.println(bulldozerMachine);

        List<Machine> excavatorMachine = machineService.getAll(Excavator.class);
        System.out.println(excavatorMachine);

        List<Machine> truckMachine = machineService.getAll(Truck.class);
        System.out.println(truckMachine);
    }
}
