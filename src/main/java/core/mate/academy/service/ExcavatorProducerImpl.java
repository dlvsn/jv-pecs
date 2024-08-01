package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private List<Excavator> excavatorList;
    private Excavator[] excavators = new Excavator[] {
            new Excavator("Excavator1", "Red", 4),
            new Excavator("Excavator2", "White", 3),
            new Excavator("Excavator3", "Black", 5)
    };

    public ExcavatorProducerImpl() {
        excavatorList = new ArrayList<>();
        excavatorList.addAll(Arrays.asList(excavators));
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
