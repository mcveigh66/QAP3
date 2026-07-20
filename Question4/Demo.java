package Question4;

public class Demo {


    public static void scaleAll(Scalable[] scalables, double factor) {
        for (Scalable obj : scalables) {
            obj.scale(factor);
        }
    }

    public static void main(String[] args) {
       
        Scalable[] scalables = new Scalable[] {
            new Circle(5.0),
            new Ellipse(7.0, 4.0),
            new Triangle(3.0, 4.0, 5.0),
            new EquilateralTriangle(6.0)
        };

        System.out.println("=== BEFORE SCALING ===");
        for (Scalable obj : scalables) {
            System.out.println(obj);
        }

        double scaleFactor = 2.0;
        System.out.println("\n--- Scaling all shapes by factor of " + scaleFactor + " ---\n");
        scaleAll(scalables, scaleFactor);

        System.out.println("=== AFTER SCALING ===");
        for (Scalable obj : scalables) {
            System.out.println(obj);
        }
    }
}
