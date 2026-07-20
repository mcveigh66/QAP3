package Question4;

/**
 * Triangle class implementing scale functionality.
 */
public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        validateAndSetSides(side1, side2, side3);
    }

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        validateAndSetSides(side1, side2, side3);
    }

    private void validateAndSetSides(double s1, double s2, double s3) {
        if ((s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2)) {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
        } else {
            System.out.println("Error: Invalid side lengths do not form a triangle.");
            System.exit(1);
        }
    }

    @Override
    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}