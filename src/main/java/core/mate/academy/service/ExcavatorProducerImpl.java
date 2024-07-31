package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private List<Excavator> excavators;

    public ExcavatorProducerImpl() {
        excavators = new ArrayList<>();
    }

    public void addExcavatorToList(Excavator[] elements) {
        excavators.addAll(Arrays.asList(elements));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}
