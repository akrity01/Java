import java.util.Scanner;

 class Ques5{
    public static void zigzag(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if ((i % 2 == 0 && arr[i] > arr[i + 1]) ||
                (i % 2 == 1 && arr[i] < arr[i + 1])) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

       
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        zigzag(arr);
        System.out.print("Zigzag Array: ");
        printArray(arr);

        scanner.close();
    }
}