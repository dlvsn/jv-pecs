package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double bladeWidth) {
        setName(name);
        setColor(color);
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "name: "
                + getName()
                + " color: "
                + getColor()
                + " blade width: "
                + bladeWidth
                + '}';
    }
}
