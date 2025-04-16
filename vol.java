import java.util.Scanner;

// Interface with abstract method
interface Volume {
    void displayVolume();
}

// Cone class implementing Volume
class Cone implements Volume {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void displayVolume() {
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.printf("Volume of Cone: %.2f\n", volume);
    }
}

// Hemisphere class implementing Volume
class Hemisphere implements Volume {
    double radius;

    Hemisphere(double radius) {
        this.radius = radius;
    }

    public void displayVolume() {
        double volume = (2.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Volume of Hemisphere: %.2f\n", volume);
    }
}

// Cylinder class implementing Volume
class Cylinder implements Volume {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void displayVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of Cylinder: %.2f\n", volume);
    }
}

// Main class to run the program
public class vol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Cone
        System.out.print("Enter radius and height of cone: ");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Volume cone = new Cone(coneRadius, coneHeight);
        cone.displayVolume();

        // Input for Hemisphere
        System.out.print("Enter radius of hemisphere: ");
        double hemiRadius = scanner.nextDouble();
        Volume hemisphere = new Hemisphere(hemiRadius);
        hemisphere.displayVolume();

        // Input for Cylinder
        System.out.print("Enter radius and height of cylinder: ");
        double cylRadius = scanner.nextDouble();
        double cylHeight = scanner.nextDouble();
        Volume cylinder = new Cylinder(cylRadius, cylHeight);
        cylinder.displayVolume();

        scanner.close();
    }
}
