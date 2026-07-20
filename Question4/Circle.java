package Question4;

public class Circle extends Ellipse {
    
    public Circle(double radius) {
        super("Circle", radius, radius);
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}
