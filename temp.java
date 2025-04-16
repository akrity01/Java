import java.util.Scanner;

// Abstract base class
abstract class Temperature {
    double temp;

    void setTempData(double temp) {
        this.temp = temp;
    }

    abstract void changeTemp();
}

// Subclass Fahrenheit
class Fahrenheit extends Temperature {
    double ctemp;

    @Override
    void changeTemp() {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.printf("Fahrenheit %.2f converted to Celsius: %.2f\n", temp, ctemp);
    }
}

// Subclass Celsius
class Celsius extends Temperature {
    double ftemp;

    @Override
    void changeTemp() {
        ftemp = (9.0 / 5) * temp + 32;
        System.out.printf("Celsius %.2f converted to Fahrenheit: %.2f\n", temp, ftemp);
    }
}

// Main class
public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fahrenheit to Celsius
        Fahrenheit f = new Fahrenheit();
        System.out.print("Enter temperature in Fahrenheit: ");
        double fTemp = scanner.nextDouble();
        f.setTempData(fTemp);
        f.changeTemp();

        // Celsius to Fahrenheit
        Celsius c = new Celsius();
        System.out.print("Enter temperature in Celsius: ");
        double cTemp = scanner.nextDouble();
        c.setTempData(cTemp);
        c.changeTemp();

        scanner.close();
    }
}
