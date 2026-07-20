package Question2;

public class Demo {
    public static void main(String[] args) {
        // Test base Point class
        System.out.println("--- Testing Point Class ---");
        Point p1 = new Point();
        System.out.println("Default Point: " + p1);

        Point p2 = new Point(2.5f, 4.5f);
        System.out.println("Custom Point: " + p2);
        
        p2.setXY(5.0f, 6.0f);
        System.out.println("After setXY: " + p2);

        // Test MovablePoint class
        System.out.println("\n--- Testing MovablePoint Class ---");
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Initial MovablePoint: " + mp1);

        // Move the point
        mp1.move();
        System.out.println("After move 1: " + mp1);

        // Move it again using method chaining (mp1.move().move())
        mp1.move().move();
        System.out.println("After 2 more moves: " + mp1);
    }
}
