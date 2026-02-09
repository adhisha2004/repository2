package areacalculator;
import java.util.Scanner;

// Abstract Base Class
abstract class Shapes {
    abstract void input();
    abstract void area();
    abstract void surfaceArea();
    abstract void totalSurfaceArea();
}

// Circle
class Circle extends Shapes {
    double r;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
    }

    void area() {
        System.out.println("Area = " + (Math.PI * r * r));
    }

    void surfaceArea() {
        System.out.println("Circumference = " + (2 * Math.PI * r));
    }

    void totalSurfaceArea() {
        System.out.println("Same as Area (2D Shape)");
    }
}

// Rectangle
class Rectangle extends Shapes {
    double l, b;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter length: ");
        l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        b = sc.nextDouble();
    }

    void area() {
        System.out.println("Area = " + (l * b));
    }

    void surfaceArea() {
        System.out.println("Perimeter = " + (2 * (l + b)));
    }

    void totalSurfaceArea() {
        System.out.println("Same as Area (2D Shape)");
    }
}

// Square
class Square extends Shapes {
    double a;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter side: ");
        a = sc.nextDouble();
    }

    void area() {
        System.out.println("Area = " + (a * a));
    }

    void surfaceArea() {
        System.out.println("Perimeter = " + (4 * a));
    }

    void totalSurfaceArea() {
        System.out.println("Same as Area (2D Shape)");
    }
}

// Rhombus
class Rhombus extends Shapes {
    double d1, d2;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter diagonal 1: ");
        d1 = sc.nextDouble();
        System.out.print("Enter diagonal 2: ");
        d2 = sc.nextDouble();
    }

    void area() {
        System.out.println("Area = " + (0.5 * d1 * d2));
    }

    void surfaceArea() {
        System.out.println("Perimeter not calculated");
    }

    void totalSurfaceArea() {
        System.out.println("Same as Area (2D Shape)");
    }
}

// Trapezium
class Trapezium extends Shapes {
    double a, b, h;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter base1: ");
        a = sc.nextDouble();
        System.out.print("Enter base2: ");
        b = sc.nextDouble();
        System.out.print("Enter height: ");
        h = sc.nextDouble();
    }

    void area() {
        System.out.println("Area = " + (0.5 * (a + b) * h));
    }

    void surfaceArea() {
        System.out.println("Perimeter not calculated");
    }

    void totalSurfaceArea() {
        System.out.println("Same as Area (2D Shape)");
    }
}

// Cube
class Cube extends Shapes {
    double a;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter side: ");
        a = sc.nextDouble();
    }

    void area() {
        System.out.println("Base Area = " + (a * a));
    }

    void surfaceArea() {
        System.out.println("Lateral Surface Area = " + (4 * a * a));
    }

    void totalSurfaceArea() {
        System.out.println("Total Surface Area = " + (6 * a * a));
    }
}

// Cylinder
class Cylinder extends Shapes {
    double r, h;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
        System.out.print("Enter height: ");
        h = sc.nextDouble();
    }

    void area() {
        System.out.println("Base Area = " + (Math.PI * r * r));
    }

    void surfaceArea() {
        System.out.println("Curved Surface Area = " + (2 * Math.PI * r * h));
    }

    void totalSurfaceArea() {
        System.out.println("Total Surface Area = " + (2 * Math.PI * r * (r + h)));
    }
}

// Main Class
public class ShapesApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shapes s = null;
        char again  = 'y'; 

        do {
            System.out.println("\n--- SHAPE AREA & SURFACE CALCULATOR ---");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Rhombus");
            System.out.println("5. Trapezium");
            System.out.println("6. Cube");
            System.out.println("7. Cylinder");
            System.out.print("Choose Shape: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: s = new Circle(); break;
                case 2: s = new Rectangle(); break;
                case 3: s = new Square(); break;
                case 4: s = new Rhombus(); break;
                case 5: s = new Trapezium(); break;
                case 6: s = new Cube(); break;
                case 7: s = new Cylinder(); break;
                default:
                    System.out.println("Invalid Choice");
                    continue;
            }

            s.input();

            System.out.println("\nChoose Operation:");
            System.out.println("1. Area");
            System.out.println("2. Surface Area / Perimeter");
            System.out.println("3. Total Surface Area");
            System.out.print("Enter option: ");
            int op = sc.nextInt();

            if (op == 1) {
                s.area();
            }
            else if (op == 2) {
                s.surfaceArea();
            }
            else if (op == 3) {
                s.totalSurfaceArea();
            }
            else {
                System.out.println("Invalid Option");
            }

            System.out.print("\nDo you want to calculate again? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("\nThank you for using Area Calculator!");
    }
}
