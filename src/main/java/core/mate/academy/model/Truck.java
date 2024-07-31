package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;

    public Truck() {
    }

    public Truck(String name, String color, double loadCapacity) {
        setName(name);
        setColor(color);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + "name: "
                + getName()
                + " color: "
                + getColor()
                + " load capacity: "
                + loadCapacity
                + '}';
    }
}
