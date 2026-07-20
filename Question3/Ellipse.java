package Question3;

public class Ellipse extends Shape {
    protected double a; // Major axis
    protected double b; // Minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        // make sure 'a' is assigned the larger value and 'b' the smaller value
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    // Constructor 
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        // Formula: P = PI * sqrt(2 * (a^2 + b^2) - ((a - b)^2) / 2) 
        return Math.PI * Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(a - b, 2) / 2.0);
    }
}
