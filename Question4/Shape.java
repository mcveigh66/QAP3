package Question4;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape: %-20s | Area: %8.2f | Perimeter: %8.2f", name, getArea(), getPerimeter());
    }
}
