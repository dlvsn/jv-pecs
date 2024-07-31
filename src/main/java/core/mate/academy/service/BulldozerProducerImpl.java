package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    private List<Bulldozer> bulldozers;

    public BulldozerProducerImpl() {
        bulldozers = new ArrayList<>();
    }

    public void addBulldozerToList(Bulldozer[] elements) {
        bulldozers.addAll(Arrays.asList(elements));
    }

    @Override
    public List<Bulldozer> get() {
        return bulldozers.isEmpty() ? Collections.emptyList() : bulldozers;
    }
}
