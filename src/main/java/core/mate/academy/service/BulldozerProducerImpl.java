package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozerList;
    private Bulldozer[] bulldozers = new Bulldozer[] {
            new Bulldozer("Buldozer1", "Green", 2),
            new Bulldozer("Buldozer2", "White", 2),
            new Bulldozer("Buldozer3", "Black", 3)
    };

    public BulldozerProducerImpl() {
        bulldozerList = new ArrayList<>();
        bulldozerList.addAll(Arrays.asList(bulldozers));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozerList;
    }
}
