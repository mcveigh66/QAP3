package Question3;

public class Circle extends Ellipse {
    @SuppressWarnings("FieldMayBeFinal")
    private double radius;

    public Circle(double radius) {
        // A circle has equal major and minor axes equal to its radius
        super("Circle", radius, radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
