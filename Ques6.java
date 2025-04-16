    import java.util.Scanner;

    public class Ques6 {
        public static void rearrange(int[] arr) {
            int left = 0, right = arr.length - 1;
    
            while (left <= right) {
                if (arr[left] < 0) {
                    left++;
                } else if (arr[right] >= 0) {
                    right--;
                } else {
                    // Swap negative number from right with positive number at left
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
        }
    
        public static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Input array size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
    
            int[] arr = new int[n];
    
            // Input array elements
            System.out.println("Enter elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
    
            // Rearrange array
            rearrange(arr);
    
            // Print the result
            System.out.println("Rearranged array:");
            printArray(arr);
    
            sc.close();
        }
    }
      
