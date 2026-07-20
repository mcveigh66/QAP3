package Question4;

public class Ellipse extends Shape {
    protected double a; // Major axis
    protected double b; // Minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        initAxes(axis1, axis2);
    }

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        initAxes(axis1, axis2);
    }

    private void initAxes(double axis1, double axis2) {
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(a - b, 2) / 2.0);
    }
}
