import java.util.Scanner;
public class Ques4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Modified number: 1");
            return;
        }
        int result = 0, place = 1;
        while (number > 0) {
            int digit = number % 10; 
            if (digit == 0) {
                digit = 1; 
            }
            result += digit * place; 
            place *= 10; 
            number /= 10; 
        }
        System.out.println("Modified number: " + result);
        scanner.close();
    }
}
