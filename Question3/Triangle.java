package Question3;

/**
 * Class representing a general Triangle shape.
 */
public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");

        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: Invalid side lengths (" + side1 + ", " + side2 + ", " + side3 + ") do not form a valid triangle.");
            System.exit(1); // Terminate program as specified
        }
    }

    // Constructor 
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: Invalid side lengths (" + side1 + ", " + side2 + ", " + side3 + ") do not form a valid triangle.");
            System.exit(1);
        }
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
