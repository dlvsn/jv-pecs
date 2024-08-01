package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducerImpl bulldozerProducer = new BulldozerProducerImpl();
    private ExcavatorProducerImpl excavatorProducer = new ExcavatorProducerImpl();
    private TruckProducerImpl truckProducer = new TruckProducerImpl();

    public MachineServiceImpl() {
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machineList = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            machineList.addAll(bulldozerProducer.get());
        }
        if (type.equals(Excavator.class)) {
            machineList.addAll(excavatorProducer.get());
        }
        if (type.equals(Truck.class)) {
            machineList.addAll(truckProducer.get());
        }

        return machineList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}
