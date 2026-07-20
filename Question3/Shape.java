package Question3;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract methods 
    public abstract double getArea();
    public abstract double getPerimeter();

    // Overridden toString method in Shape class as said by assignment instructions
    @Override
    public String toString() {
        return String.format("Shape: %-20s | Area: %8.2f | Perimeter: %8.2f", name, getArea(), getPerimeter());
    }
}
