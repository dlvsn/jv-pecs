package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double armLength;

    public Excavator() {
    }

    public Excavator(String name, String color, double armLength) {
        setName(name);
        setColor(color);
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{"
                + "name: "
                + getName()
                + " color: "
                + getColor()
                + " arm length: "
                + armLength
                + '}';
    }
}
