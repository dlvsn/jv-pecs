package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private List<Truck> truckList;
    private Truck[] trucks = new Truck[] {
            new Truck("Truck1", "Yellow", 100),
            new Truck("Truck2", "Blue", 150),
            new Truck("Truck3", "Red", 200)
    };

    public TruckProducerImpl() {
        truckList = new ArrayList<>();
        truckList.addAll(Arrays.asList(trucks));
    }

    @Override
    public List<Truck> get() {
        return truckList;
    }
}
