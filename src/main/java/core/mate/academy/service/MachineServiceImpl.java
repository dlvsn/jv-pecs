package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducerImpl bulldozerProducer;
    private ExcavatorProducerImpl excavatorProducer;
    private TruckProducerImpl truckProducer;

    public MachineServiceImpl() {
    }

    public MachineServiceImpl(BulldozerProducerImpl bulldozerProducer,
                              ExcavatorProducerImpl excavatorProducer,
                              TruckProducerImpl truckProducer) {
        this.bulldozerProducer = bulldozerProducer;
        this.excavatorProducer = excavatorProducer;
        this.truckProducer = truckProducer;
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machineList = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            machineList.addAll(bulldozerProducer.get());
        } else if (type.equals(Excavator.class)) {
            machineList.addAll(excavatorProducer.get());
        } else {
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
