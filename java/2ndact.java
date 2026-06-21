import java.util.Scanner;

class Shape {
    // Circle area
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle area
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Triangle area
    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        System.out.println("Choose shape: 1.Circle  2.Rectangle  3.Triangle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle = " + s.area(r));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                System.out.println("Area of Rectangle = " + s.area(l, b));
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                System.out.println("Area of Triangle = " + s.area(base, h, true));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
    