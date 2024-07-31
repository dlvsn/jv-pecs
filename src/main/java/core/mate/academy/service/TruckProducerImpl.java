package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private List<Truck> trucks;

    public TruckProducerImpl() {
        trucks = new ArrayList<>();
    }

    public void addTruckToList(Truck[] elements) {
        trucks.addAll(Arrays.asList(elements));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
