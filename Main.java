import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from a package!");
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("sum of two number:"+(a+b));
        System.out.println("Area ="+(a*b));

    }
}
