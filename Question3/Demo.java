package Question3;

public class Demo {
    public static void main(String[] args) {
        // Array of type Shape storing objects from all classes
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(7.0, 4.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(6.0);

        System.out.println("=== SHAPE COMPUTATION RESULTS ===");
        // Loop through array and print objects 
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
